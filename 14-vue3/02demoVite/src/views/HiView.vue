<script lang="ts" setup>
import {useRoute} from "vue-router";
import {getCurrentInstance} from "vue";
// 相当于vue2的this
const _this = getCurrentInstance()
console.log(_this.appContext.config.globalProperties.$haha)

console.log(useRoute().params.id)
</script>

<template>
  <h1>123</h1>
</template>

<style lang="scss" scoped>

</style>
