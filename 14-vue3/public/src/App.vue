<script lang="ts" setup>
import {RouterLink, RouterView} from 'vue-router'
</script>

<template>
  <nav>
    <RouterLink style="margin-right: 16px;" to="/">Home</RouterLink>
    |
    <RouterLink style="margin-left: 16px;" to="/cart">Cart</RouterLink>
  </nav>

  <RouterView/>
</template>
