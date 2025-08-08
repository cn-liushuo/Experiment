<template>
  <p>{{ name }}</p>
  <p>{{ like }}</p>
  <button @click="change">改变</button>
</template>

<script lang="ts" setup>
import {reactive, toRefs} from 'vue';

//
const state = reactive({
  name: "王国华",
  like: "吃"
})
// 解构赋值无法做到响应式
// let {name, like} = state
// toRefs可以将reactive对象中的所有属性转为单独的响应式，并且这些ref仍然保持对象属性之间的响应式
let {name, like} = toRefs(state)
let change = () => {
  like.value = "吃窝窝头"
  console.log(state.like)//吃窝窝头
}
</script>
