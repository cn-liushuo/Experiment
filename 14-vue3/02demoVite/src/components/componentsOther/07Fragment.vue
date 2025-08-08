<template>
  <!--
    在vue2中：组件必须有一个根标签
    在vue3中：组件可以没有根标签，内部会将多个标签包含在一个Fragment虚拟元素中
   -->
  <div>123</div>
  <div>123</div>
  <div>123</div>
  <h1>
    在vue3中：组件可以没有根标签，内部会将多个标签包含在一个Fragment虚拟元素中
  </h1>
</template>

<script lang="ts" setup>
// this.$route.query
import {useRoute} from "vue-router";

const route = useRoute()
// 接收 query 传参
console.log(route.query)
// console.log(route.params)
</script>
