<script lang="ts" setup>
import {RouterView} from 'vue-router'
// 使用 pinia
// 引入
// import {useCounterStore} from "@/stores/counter.ts";
//
// const counterStore = useCounterStore();
// console.log(counterStore.count)
// console.log(counterStore.doubleCount)
// counterStore.increment()
// console.log(counterStore.count)
</script>

<template>
  <!-- vue3支持多根节点 -->

  <RouterView/>
</template>

<style scoped>
* {
  margin: 0;
  padding: 0;
}

#app {
  height: 100vh;
}
</style>
