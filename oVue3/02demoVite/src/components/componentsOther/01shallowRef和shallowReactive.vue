<template>
  <h1>shallowRef shallowRective</h1>
  <h2>reactive: {{ m1 }}</h2>
  <h2>ref: {{ m2 }}</h2>
  <h2>shallowRef: {{ m3 }}</h2>
  <h2>shallowReactive: {{ m4 }}</h2>
  <hr>
  <el-button @click="change">更新数据</el-button>
</template>
<script lang="ts" setup>
import {shallowReactive} from 'vue';
import {reactive, ref, shallowRef} from 'vue';


const m1 = reactive({
  name: "霍霍",
  car: {
    name: "BMW"
  }
})

const m2 = ref({
  name: "菲菲",
  car: {
    name: "BYD"
  }
})

const m3 = shallowRef({
  name: "姬呈昕",
  car: {
    name: "迈巴赫"
  }
})

const m4 = shallowReactive({
  name: "王国华",
  car: {
    name: "桑塔纳"
  }
})

let change = () => {
  // reactive  --- 深度响应式
  // m1.name = "于昊天"
  // m1.car.name = "小米su7 Utrl"

  // shallowReactive --- 浅度响应式
  // 直接修改其他层级，数据失效，要先改第一层
  // m4.name = "范存义"
  // m4.car.name = "老爷车"

  // ref -- 深度响应式
  // m2.value.car.name = "扭扭车"

  // shallowRef  ----- 怎么改都改不了
  m3.value.name = "霍霍"
  m3.value.car.name = "吸粪车"


}
</script>
