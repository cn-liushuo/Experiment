<template>
  <h1>readonly和shallowReadonly</h1>
  <h2>{{ state }}</h2>
  <button @click="change">更新数据</button>
</template>

<script lang="ts" setup>
import {shallowReadonly} from 'vue';
import {reactive, readonly} from 'vue';

const state = reactive({
  name: "霍霍",
  car: {
    name: "汗血宝马"
  }
})
// readonly深度只读  无法修改
let state1 = readonly(state)
// shallowReadonly 浅度只读
let state2 = shallowReadonly(state)
let change = () => {
  // state1.name = "旭旭"
  // state1.car.name = "赤兔马"
  // 更深层可以修改
  // state2.name = "唠唠"
  state2.car.name = "赤兔"
}
</script>
