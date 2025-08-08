<script lang="ts" setup>
import one from './one.vue'
import {provide, ref} from "vue";

// provide 向后代传参
const name = ref("大菠萝")

provide("name", name)
</script>

<template>
  <one></one>
</template>

<style lang="scss" scoped>

</style>
