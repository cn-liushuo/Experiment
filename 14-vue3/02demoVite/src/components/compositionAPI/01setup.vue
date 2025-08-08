<template>
  <h1>setup</h1>
  {{ str }}
  <input v-model="str" type="text">
  <button @click="goTo">同级跳转</button>
</template>
<!--lang语言  -->
<script lang="ts">
import {defineComponent, ref} from 'vue';
import router from '@/router'

// defineComponent 自定义一个组件， 内部传入配置对象
export default defineComponent({
  // 1.setup 是组合式api的入口，只在初始化的时候执行一次
  // 2.setup 是处在生命周期beforeCreate和created之间， 所以setup中无法使用data和this
  // 3.setup中定义的变量和函数，都要return出去 否则用不了
  setup() {
    // ref定义一个响应式数据
    let str = ref("我是刘德华")
    const goTo = () => {
      router.push({
        path: '/home/about/detail/hello/10'
      })
    }
    return {
      // return才能用
      str, goTo
    }
  }
})

</script>
