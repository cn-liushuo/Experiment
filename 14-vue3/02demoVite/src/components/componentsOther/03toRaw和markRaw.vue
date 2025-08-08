<template>
  <h1>toRaw</h1>
  <h2>{{ state }}</h2>
  <h2>toRaw {{ user }}</h2>
  <button @click="handleToRaw">toRaw</button>
  <button @click="handleMarkRaw">markRaw</button>
</template>

<script lang="ts" setup>
import {markRaw} from 'vue';
import {toRaw} from 'vue';
import {reactive} from 'vue';

// 接口
interface User {
  name: string;
  car: any;
  arr?: any[]
}

let state: User = reactive({
  name: "霍霍",
  car: {
    name: "卡丁车"
  }
})
// toRaw 把代理对象变成普通对象 没有响应式
let user = toRaw(state)

let handleToRaw = () => {
  user.name = "霍霍2"
  console.log(user);

}
const arr = [1, 2, 3, 4]
let handleMarkRaw = () => {
  state.arr = markRaw(arr)
  // markRaw标记的属性 不能再次被标记成代理对象
  // 数据更改了 页面ui没更改
  setInterval(() => {
    if (state.arr) {
      state.arr[0] += "Huohuo"
      console.log(state.arr);
    }
  }, 1000)
}
</script>
