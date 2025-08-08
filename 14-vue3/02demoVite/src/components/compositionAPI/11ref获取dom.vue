<template>
  <input ref="inp" type="text">
</template>
<script lang="ts" setup>
import {ref, onMounted} from 'vue';
// dom加载完成之后
onMounted(() => {
  // 可以拿到dom
  console.log(inp.value);
  // inp.value&&inp.value.focus()
  // 非空断言
  inp.value!.focus()
});


// 1.变量名跟ref名字一致
let inp: any = ref(null)
console.log(inp.value)//null setup beforeCreate 和created之间

</script>
