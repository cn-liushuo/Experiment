<template>
  <div class="about">
    <div class="search">
      <el-form :model="pageParams" label-width="auto" style="max-width: 600px">
        <el-row :gutter="10">
          <el-col :span="10">
            <el-form-item label="名字">
              <el-input v-model.trim="pageParams.userName"/>
            </el-form-item>
          </el-col>
          <el-col :span="10">
            <el-button type="primary" @click="getSeach">查询</el-button>
            <el-button type="primary" @click="addDialog">新增</el-button>
          </el-col>
        </el-row>
      </el-form>
    </div>
    <div class="table">
      <el-table :data="tableData" style="width: 100%">
        <el-table-column label="序号" type="index" width="80"/>
        <el-table-column label="用户名" prop="userName" width="180"/>
        <el-table-column label="姓名" prop="name" width="180"/>
        <el-table-column label="创建时间" prop="createdAt"/>
        <el-table-column label="操作">
          <template #default="scope">
            <el-button :icon="Edit" circle type="primary" @click="editDialog(scope.row)"/>
            <el-button :icon="Delete" circle type="danger" @click="del(scope.row.id)"/>
            <el-button :icon="View" circle type="warning"/>
          </template>
        </el-table-column>
      </el-table>
      <!--
        v-model:current-page="pageParams.page" 当前页码
        v-model:page-size="pageParams.rows"  当前页有多少条

       -->
      <page :pageParam="pageParams" :total="total" @page-change="changePage" @row-change="changeRow"></page>
      <!-- 封装分页 -->
      <!-- 新增 -->

    </div>

  </div>
  <!-- 新增 -->
  <el-dialog v-model="dialogVisible" :before-close="reset" :title="title" width="500">
    <div>
      <el-form ref="ruleFormRef" :model="ruleForm" :rules="rules" :size="formSize" class="demo-ruleForm"
               label-width="auto" status-icon style="max-width: 600px">
        <el-form-item label="用户名" prop="userName">
          <el-input v-model="ruleForm.userName"/>
        </el-form-item>
        <el-form-item v-if="title == '新增'" label="密码" prop="passWord">
          <el-input v-model="ruleForm.passWord" clearable placeholder="请输入密码"/>
        </el-form-item>
        <el-form-item label="权限" prop="role">
          <el-select v-model="ruleForm.role" placeholder="Select" size="large" style="width: 240px">
            <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value"/>
          </el-select>
        </el-form-item>
        <el-form-item label="管理员姓名" prop="name">
          <el-input v-model="ruleForm.name"/>
        </el-form-item>
      </el-form>
    </div>
    <template #footer>
      <div class="dialog-footer">
        <el-button @click="reset">取消</el-button>
        <el-button type="primary" @click="submitForm(ruleFormRef)">
          确定
        </el-button>
      </div>
    </template>
  </el-dialog>
</template>
<script lang="ts" setup>
import page from "../components/page.vue"
import {Delete, Edit, View} from '@element-plus/icons-vue'
import {nextTick, onMounted, reactive, ref} from 'vue';
import {userAdd, userdel, userEdit, userList} from "../api/user"
import {type ComponentSize, ElMessage, type FormInstance, type FormRules} from 'element-plus'

const dialogVisible = ref(false)
const title = ref('')
const total = ref(0)//
interface RuleForm {
  name: string | null
  userName: string | null
  passWord: string
  role: number | null
}

const options = [{
  value: 1,
  label: "超级管理员"
}, {
  value: 2,
  label: "管理员"
}, {
  value: 3,
  label: "普通用户"
}]
const formSize = ref<ComponentSize>('default')
const tableData: any = ref([])
const pageParams = reactive({
  rows: 10,
  page: 1,
  userName: null
})
const rules = reactive<FormRules<RuleForm>>({
  name: [
    {required: true, message: 'Please input Activity name', trigger: 'blur'}
  ],
  userName: [
    {required: true, message: 'Please input Activity name', trigger: 'blur'}
  ],
  passWord: [
    {required: true, message: 'Please input Activity name', trigger: 'blur'}
  ],
  role: [
    {required: true, message: 'Please input Activity name', trigger: 'blur'}
  ]
})
const ruleFormRef = ref<FormInstance>()
const ruleForm = reactive<RuleForm>({
  name: null,
  userName: '',
  passWord: '123456',
  role: null
})


onMounted(() => {
  getList()
})
const id = ref(0)
// 新增
const submitForm = async (formEl: FormInstance | undefined) => {
  if (!formEl) return
  await formEl.validate((valid, fields) => {
    if (valid) {
      if (title.value == '新增') {
        // 新增接口
        userAdd(ruleForm).then((res: any) => {
          console.log(res)
          if (res.code == 200) {
            // 关闭模态框 刷新列表
            dialogVisible.value = false
            getList()
          }
        })
          .catch((err: any) => {
            if (err.code == 188) {
              ElMessage.error("用户名重复")
            }
          })
      } else {
        // 确认编辑
        userEdit({id: id.value, ...ruleForm}).then((res: any) => {
          if (res.code == 200) {
            dialogVisible.value = false
            getList()
            ElMessage.success("更新成功")
          }
        })
      }

    } else {
      console.log('error submit!', fields)
    }
  })
}

// 一页有几条
const changePage = (val: number) => {
  pageParams.rows = val
  pageParams.page = 1
  getList()
}
// 页码数
const changeRow = (n: number) => {
  pageParams.page = n
  getList()
}
// 查询
const getSeach = () => {
  pageParams.page = 1
  getList()
}
const getList = async () => {
  const res = await userList(pageParams)
  console.log(res)
  total.value = res.data.count

  tableData.value = res.data.list

}

// 新增弹出框
function addDialog() {
  reset()
  title.value = "新增"
  dialogVisible.value = true
  // 清除校验
  // 获取不到dom元素
  // nextTick(() => {
  //   ruleFormRef.value!.resetFields()
  // })
}

// bianji
function editDialog(row: any) {
  reset()
  console.log(row)
  title.value = "编辑"
  dialogVisible.value = true
  ruleForm.name = row.name
  ruleForm.userName = row.userName
  ruleForm.role = row.role
  id.value = row.id
}

function reset() {
  nextTick(() => {
    // clearValidate只清除校验
    ruleFormRef.value?.clearValidate()
  })
  dialogVisible.value = false
  ruleForm.name = null
  ruleForm.userName = null
  ruleForm.role = null
}

// 删除
function del(id: number) {
  userdel({id}).then((res: any) => {
    if (res.code == 200) {
      ElMessage.success("删除成功")
      getList()
    }
  })
}
</script>

<style scoped>
.about {
  height: 100%;
}
</style>
