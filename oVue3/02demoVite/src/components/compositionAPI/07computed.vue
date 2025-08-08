<template>
  <h1>计算属性---computed</h1>
  <!-- fieldset 创建一个包含表单元素的容器  legend是定义在fieldset中的标题 -->
  <fieldset>
    <legend>姓名操作</legend>
    姓氏：<input v-model="user.firstName" placeholder="请输入姓氏" type="text">
    <br/>
    名字：<input v-model="user.lastName" placeholder="请输入名字" type="text">
  </fieldset>

  <fieldset>
    <legend>计算属性展示</legend>
    姓名：<input v-model="fullName" placeholder="请输入姓名" type="text">
    <br/>
    姓名：<input v-model="setName" placeholder="请输入姓名" type="text">
  </fieldset>
</template>
<script lang="ts" setup>
import {ref, reactive, computed} from "vue"

let user = reactive({
  firstName: "东方",
  lastName: "不败",
})

// 单向联动  计算属性函数如果只传递一个参数，默认是get获取
// 只能实现单向获取  当依赖数据发生变化的时候结果会发生变化，但是修改结果依赖数据不变
let fullName = computed(() => {
  return user.firstName + '-' + user.lastName
})

let setName = computed({
  // 获取
  get() {
    return user.firstName + '-' + user.lastName
  },
  // 设置
  set(val) {
    // console.log(val,"数据")
    // 当用户修改姓名的时候 将姓氏和名字赋值给表单元素
    user.firstName = val.split('-')[0]
    user.lastName = val.split('-')[1]
  }
})
</script>
