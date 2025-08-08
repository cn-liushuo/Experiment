<script lang="ts" setup>

import {useCounterStore} from "@/stores/counter.ts";

const counterStore = useCounterStore();
console.log(counterStore.count)

const add = () => {
  counterStore.increment()
}
// 重置
let reset = () => {
  counterStore.$reset()
  localStorage.removeItem('my')
}

// setInterval(() => {
//   counterStore.increment()
// },100)
</script>

<template>
  <h1>count：{{ counterStore.count }}</h1>
  <h1>计算属性：{{ counterStore.doubleCount }}</h1>
  <button @click="add">加1</button>
  <button @click="reset">重置</button>
</template>

<style lang="scss" scoped>

</style>
