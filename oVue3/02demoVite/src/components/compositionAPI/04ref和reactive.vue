<template>
  <h1>ref和reactive</h1>
  <p>m1 : {{ m1 }}</p>
  <p>m2 : {{ m2 }}</p>
  <p>m3 : {{ m3 }}</p>

  <button @click="hanldeClick">更新数据</button>
</template>
<script lang="ts">
import {defineComponent, ref, reactive} from 'vue';

export default defineComponent({
  setup() {
    // 通过ref定义的基本数据类型
    let m1 = ref('我是m1')
    // 通过ref定义的复杂数据类型
    let m2 = ref({
      name: "盖老板",
      wifi: {
        title: "没有不吃的"
      }
    })
    // 通过reactive定义的复杂数据类型
    let m3 = reactive({
      name: "猪八戒",
      wifi: {
        title: "喝水"
      }
    })

    let hanldeClick = () => {
      // 通过ref定义的基本数据类型  修改或者获取数据的时候加上.value
      m1.value += '嘎~'
      // 通过ref定义的复杂数据类型 内部会自动将响应式数据转换成reactive代理对象的形式
      m2.value.name += '嘎~'
      m2.value.wifi.title += '嘎~'
      // console.log(m1,m2)
      // 通过reactive定义的复杂数据类型 获取或者修改数据的时候不需要加上value
      m3.name += '嘎~'
    }
    return {
      m1,
      m2,
      m3,
      hanldeClick
    }
  }
})

/*
    ref 和 reactive 的区别
    ref和reactive是vue3组合式api中最重要的响应式api

    ref用来处理基本数据类型  reactive用来处理复杂数据类型
    如果用ref处理复杂数据类型，那么内部会自动将复杂数据类型转为reactive代理对象形式

    ref定义的数据 要value，reactive定义的数据不需要
*/
</script>
