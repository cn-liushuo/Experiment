<template>
  <h1>响应式数据的判断</h1>
</template>

<script lang="ts" setup>
import {
  isProxy,
  isReactive,
  isReadonly,
  isRef,
  reactive,
  readonly,
  ref,
} from "vue";

let name = ref("霍华");
let age = reactive({
  age: 10,
});
let sex = readonly({});
// isRef 判断是否是ref对象
console.log(isRef(name), isRef(age)); // true false
// isReactive 判断是否是reactive对象
console.log(isReactive(name), isReactive(age)); // false true
// isReadonly 判断是否是readonly对象
console.log(isReadonly(age), isReadonly(sex)); // false true
// isProxy 判断是否是reactive或readonly对象
console.log(isProxy(age), isProxy(name), isProxy(sex)); // true true true
</script>
