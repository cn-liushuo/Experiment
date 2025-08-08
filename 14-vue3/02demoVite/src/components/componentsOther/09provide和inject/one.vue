<script lang="ts" setup>
import two from './two.vue'
import {inject} from "vue";
// 接收provide发送的数据
let son = inject("name")
</script>

<template>
  <h1>one儿子------{{ son }}</h1>
  <two></two>
</template>

<style lang="scss" scoped>

</style>
