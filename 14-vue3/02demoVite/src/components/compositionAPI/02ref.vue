<template>
  <!-- v2 -->
  <div>
    {{ num }}
    <input v-model="num" type="text">
  </div>
  <div>
    {{ str }}----{{ str1 }}
    <button @click="change">点击</button>
  </div>
</template>

<script lang="ts">
import {defineComponent, ref, unref, isRef} from 'vue';

export default defineComponent({
  // v2
  data() {
    return {
      num: 10
    }
  },
  mounted() {
    console.log(this, "this指向vue实例，跟vue2不太一样，因为vue3的响应式原理是proxy")
    console.log(this.str)
  },
  // v3
  setup() {
    // console.log(this,"this");//undefined
    let str1 = '小豆'
    // ref是组合式api的一个方法,作用是定义一个响应式数据
    let str = ref("吴彦祖")

    let change = () => {
      str1 += '1'
      console.log(str1, 'str1')
      console.log(str.value)
      // 被ref包裹的数据. 取赋值的时候,必须加上value, 变量.value
      str.value = "霍霍"

      // unref包裹的数据可以直接提取到value的值
      let val = unref(str)
      console.log(val, 'val')

      // isRef 判断一个对象是不是一个ref对象  是不是用ref定义的数据
      console.log(isRef(str), '区分一下')
    }
    return {
      str1,
      str,
      change
    }
  }

});
</script>
