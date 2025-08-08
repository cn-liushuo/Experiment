// import './assets/main.css'

import {createApp} from 'vue'
import {createPinia} from 'pinia'

import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

import zhCn from 'element-plus/es/locale/lang/zh-cn'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

import App from './App.vue'
import router from './router'
// 安装持久化插件 npm i pinia-plugin-persist
// 导入持久化插件
import piniaPersist from "pinia-plugin-persist"

const app = createApp(App)
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
  app.component(key, component)
}
// vue2
// Vue.prototype.$haha
// vue3 相当于 Vue.prototype.$haha
app.config.globalProperties.$haha = "孙悟空"
const pinia = createPinia()

pinia.use(piniaPersist)
app.use(pinia)
app.use(router)
app.use(ElementPlus, {
  locale: zhCn,
})
app.mount('#app')
