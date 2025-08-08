import {defineStore} from "pinia";
import {login} from "@/api/login";
import {ElMessage} from "element-plus";
import router from "@/router";

export const useUserStore = defineStore('user', {
  state: () => ({
    token: ''
  }),
  getters: {},
  actions: {
    setToken(val: string) {
      // 仿vuex的写法需要用this
      this.token = val
      localStorage.setItem('token', val)
    },
    // 退出登录
    removeToken() {
      this.token = ''
      localStorage.removeItem('token')
    },
    // 大菠萝登录
    getLogin(params: object) {
      login(params).then((res: any) => {
        if (res.code == 200) {
          this.setToken(res.data.token)
          ElMessage({
            message: '登录成功',
            type: 'success',
          })
          router.push('/home')
        }
      })
        .catch(err => {
          ElMessage({
            message: err.msg,
            type: 'error',
          })
        })
    }
  }
})
