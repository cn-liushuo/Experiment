<template>
  <h1>watch</h1>
  姓名: <input v-model="name" type="text">
  性别: <input v-model="sex" type="text">

  {{ data }}
  <button @click="change">点击</button>
</template>
<script lang="ts" setup>
import {watchEffect} from 'vue';
import {ref, reactive, watch} from 'vue';

let name = ref('霍霍')
let sex = ref("nan")
let data = ref({
  name: [1, 2, 3]
})
let re = reactive({
  age: 1
})

function change() {
  console.log(sex)
  console.log(data)
  console.log(re)
  data.value.name.push(666)
}

//  语法 watch(变量, (新数据,旧数据) => {})
// 监听单个属性
watch(name, (newVal, oldVal) => {
  console.log(newVal, oldVal)
})
// 监听多个属性
watch([name, sex], (newVal, oldVal) => {
  console.log(newVal, oldVal)
})

// 自动收集依赖，默认初始化监听一次
// watchEffect
watchEffect(() => {
  console.log(name.value, sex.value, "effect")
})
</script>
