import axios from "axios";
import Qs from 'qs'
import {useUserStore} from "@/stores/user";
import type {Action} from 'element-plus'
import {ElMessageBox} from 'element-plus'
import router from "@/router";
// 封装
const serve = axios.create({
  baseURL: 'http://wish.byesame.com',
  timeout: 5000,
  // 请求头
  headers: {
    "Content-Type": "application/x-www-form-urlencoded"
  }
})

// 封装拦截器
serve.interceptors.request.use((config: any) => {
  if (config.url != "/login") {
    // token 获取 pinia存储的token
    // config.headers.token = useUserStore().token
    config.headers.token = localStorage.getItem('token')
  }
  if (config.method == 'get') {
    config.paramsSerializer = function (params: any) {
      // stringify {name: zs, age: 18} => name=zs&age=18
      return Qs.stringify(params)
    }
  }

  return config
})

// 封装响应拦截器
serve.interceptors.response.use((res: any) => {
  //
  if (res.data.code === 200) {
    return res.data
  } else if (res.data.code === 401) {
    ElMessageBox.alert('您的登录已过期，请重新登录', '提示', {
      // if you want to disable its autofocus
      // autofocus: false,
      confirmButtonText: 'OK',
      callback: (action: Action) => {
        // 清除token
        useUserStore().removeToken()
        // 跳转
        router.push({
          path: "/login"
        })
      },
    })
  } else {
    return Promise.reject(res.data)
  }
})

export default serve
