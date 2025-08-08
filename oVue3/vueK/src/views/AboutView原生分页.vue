<template>
  <div class="about">
    <div class="search">
      <el-form :model="form" label-width="auto" style="max-width: 600px">
        <el-row :gutter="10">
          <el-col :span="10">
            <el-form-item label="名字">
              <el-input v-model="form.name"/>
            </el-form-item>
          </el-col>
          <el-col :span="10">
            <el-button type="primary">查询</el-button>
            <el-button type="primary">重置</el-button>
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
          <el-button :icon="Edit" circle type="primary"/>
          <el-button :icon="Delete" circle type="danger"/>
          <el-button :icon="View" circle type="warning"/>
        </el-table-column>
      </el-table>
      <!--
        v-model:current-page="pageParams.page" 当前页码
        v-model:page-size="pageParams.rows"  当前页有多少条

       -->
      <el-pagination
        v-model:current-page="pageParams.page"
        v-model:page-size="pageParams.rows"
        :background="background"
        :disabled="disabled"
        :page-sizes="[10, 20, 30, 40]"
        :size="size"
        :total="total"
        layout="total, sizes, prev, pager, next, jumper"
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
      />
      <!-- 封装分页 -->
    </div>
  </div>
</template>
<script lang="ts" setup>
import {Delete, Edit, View} from '@element-plus/icons-vue'
import {onMounted, reactive, ref} from 'vue';
import {userList} from "../api/user"
import type {ComponentSize} from 'element-plus'

const currentPage4 = ref(4)
const pageSize4 = ref(10)
const size = ref<ComponentSize>('default')
const background = ref(true)
const disabled = ref(false)
const total = ref(0)
const handleSizeChange = (val: number) => {
  pageParams.rows = val
  pageParams.page = 1
  getList()
}
// 切换页码触发
const handleCurrentChange = (val: number) => {
  pageParams.page = val
  getList()
}
const form = reactive({
  name: ""
})
const tableData: any = ref([])
const pageParams = reactive({
  rows: 10,
  page: 1
})
onMounted(() => {
  getList()
})
const getList = async () => {
  const res = await userList(pageParams)
  console.log(res)
  total.value = res.data.count

  tableData.value = res.data.list

}
</script>

<style scoped>
.about {
  height: 100%;
}
</style>
