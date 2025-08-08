<template>
  <h1>toRef</h1>
  <h2>{{ state }}</h2>
  <h2>{{ act }} --- {{ name }}</h2>
  <button @click="change">更新数据</button>
</template>

<script lang="ts" setup>
import {reactive, ref, toRef} from "vue";

const state = reactive({
  name: "王国华",
  act: "吃了吗",
});
// ref是拷贝了一份响应式数据，和state没有关联
const act = ref(state.act);
// toRef的数据与原响应式数据有关联 一起变
const name = toRef(state, "name");
let change = () => {
  act.value = "吃烧烤";
  name.value = "huohuo";
};
</script>
