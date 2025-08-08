<template>
  <h4>x=> {{ x }} y => {{ y }}</h4>
  <el-button @click="getPosition">获取</el-button>
</template>

<script lang="ts" setup>
import hook from './hook'

console.log(hook());

const {x, y, getPosition} = hook()

</script>
