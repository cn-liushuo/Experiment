<script lang="ts" setup>
import {inject} from "vue";

let sun = inject("name")
</script>

<template>
  <h1>孙子---{{ sun }}</h1>
</template>

<style lang="scss" scoped>

</style>
