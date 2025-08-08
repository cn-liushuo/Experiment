<template>
  <div class="box">
    <h1>父组件</h1>
    <p>展示msg1---{{ msg1 }}</p>
    <button @click="handleClickRef">点击触发</button>
    <!-- 第二步 使用子组件 -->
    <son
      ref="dom"
      :count="count"
      :msg1="msg1"
      :msg2="msg2"
      @handleA="handleS1"
      @handleB="handleS2"></son>

    <p>儿子给父亲送礼--{{ str1 }}--{{ str2 }}</p>
  </div>
</template>
<!-- setup语法糖  帮我们return -->
<script lang="ts" setup>
// 第一步 引入子组件 并且注册了
import son from "./son.vue"

import {ref} from "vue"

let msg1 = ref('我是父组件中的msg1')
let msg2 = ref('我是父组件中的msg2')
let count = ref('我是父组件中的count')


// 子传父接收
let str1 = ref('');
let str2 = ref('');
let handleS1 = (val: string) => {
  str1.value = val
}
let handleS2 = (val: string) => {
  str2.value = val
}

// 定义名称
let dom: any = ref()
let handleClickRef = () => {
  // console.log(dom,'dom')
  console.log(dom.value.son3)
  dom.value.handleY('明个还上课，假的')
  // this.$refs.dom.handleY()  //vue2的写法
}
</script>
