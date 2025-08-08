<template>
  <child></child>
</template>
<script lang="ts" setup>
import child from "./10lifeChild.vue"
import {onBeforeMount, onMounted, onBeforeUpdate, onUpdated, onUnmounted, onBeforeUnmount} from 'vue';

// vue3生命周期只有6个 beforeCreate和Created被setup替代了
onBeforeMount(() => {
  console.log("v3-dom加载完成之前");

})
onMounted(() => {
  console.log("v3-dom加载完成之后");

})
onBeforeUpdate(() => {
  console.log("v3-数据更新之前");

})
onUpdated(() => {
  console.log("v3-数据更新之后");

})
onBeforeUnmount(() => {
  console.log("v3-实例销毁之前");

})
onUnmounted(() => {
  console.log("v3-实例销毁之后");

})


</script>
