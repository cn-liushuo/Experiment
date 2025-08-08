<template>
  <div class="big">
    <div class="box">
      <div>
        <h3>请登录账号</h3>
      </div>
      <div>
        <el-form ref="ruleFormRef" :model="form" :rules="rules" label-width="auto"
                 style="max-width: 600px;width: 95%;">
          <el-form-item label="账号" prop="userName">
            <el-input v-model="form.userName"/>
          </el-form-item>
          <el-form-item label="密码" prop="passWord">
            <el-input v-model="form.passWord" type="password"/>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="submitForm(ruleFormRef)">
              Create
            </el-button>
            <el-button size="small" type="primary" @click="piniaLogin(ruleFormRef)">pinia登录</el-button>
            <el-button @click="resetForm(ruleFormRef)">Reset</el-button>
          </el-form-item>
        </el-form>
      </div>
      <!-- <div style="display: flex;justify-content: center;">
          <el-button type="primary" size="small">本地登录</el-button>
          <el-button type="primary" size="small">pinia登录</el-button>
          <el-button size="small">重置</el-button>
      </div> -->
      <div style="text-align: right;">
        <p>没有账号？请<a href="">注册</a></p>
      </div>
    </div>
  </div>
</template>
<script lang="ts" setup>
import {reactive, ref} from 'vue'
import {useRouter} from 'vue-router';
import {login} from "../api/login"
import {ElMessage, type FormInstance, type FormRules} from 'element-plus'
// 使用pinia
import {useUserStore} from "../stores/user"
// 导入路由
import router from '@/router';

const useUser = useUserStore()
const ruleFormRef = ref<FormInstance>()
// do not use same name with ref
const form = reactive({
  userName: 'admin',
  passWord: '123456'
})
let route = useRouter()
const resetForm = (formEl: FormInstance | undefined) => {
  if (!formEl) return
  formEl.resetFields()
}
// pinia登录
const piniaLogin = async (formEl: FormInstance | undefined) => {
  if (!formEl) return
  await formEl.validate((valid, fields) => {
    if (valid) {
      useUser.getLogin(form)
    } else {
      console.log('error submit!', fields)
    }
  })
}

const submitForm = async (formEl: FormInstance | undefined) => {
  if (!formEl) return
  await formEl.validate((valid, fields) => {
    if (valid) {
      // 调用登录接口
      login(form).then((res: any) => {
        console.log(res)
        if (res.code == 200) {
          ElMessage({
            message: '登录成功',
            type: 'success',
          })
          useUser.setToken(res.data.token)
          router.push({
            path: "/home"
          })
        }
      })
        .catch((err: any) => {
          console.log(err)
          ElMessage({
            message: err.msg,
            type: 'error',
          })
        })
    } else {
      console.log('error submit!', fields)
    }
  })
}

interface RuleForm {
  userName: string
  passWord: string
}

const rules = reactive<FormRules<RuleForm>>({
  userName: [
    {required: true, message: '用户名不能为空', trigger: 'blur'}
  ],
  passWord: [
    {required: true, message: '密码不能为空', trigger: 'blur'}
  ],
})
</script>
<style>
.box {
  background-color: white;
  padding: 0 20px;
  width: 20%;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.big {
  width: 100%;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
