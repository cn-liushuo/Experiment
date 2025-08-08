<template>
  <h1>我是父组件</h1>
  <div>
    <button @click="handle1">更新数据</button>
    <p>展示一下父组件中的msg1---{{ msg1 }}</p>
    <p>展示一下儿子的孝敬--{{ str }}</p>
    <!-- 第三步 使用子组件 -->
    <child :msg1="msg1" :msg2="msg2" @hanldeSon="handleS">
      <template v-slot:abc="props">
        <p>我是作用域插槽--{{ props.obj }}</p>
      </template>
    </child>
  </div>
</template>
<script lang="ts">
import {defineComponent, ref} from "vue"
// 第一步 引入子组件
import child from "./child.vue"

export default defineComponent({
  setup() {
    let msg1 = ref('我是父组件中的msg1')
    let msg2 = ref('我是父组件中的msg2')

    let handle1 = () => {
      msg1.value += '6'
    }
    let str = ref('')
    // 子传父接收
    let handleS = (val: string) => {
      // 将接收到的值传递给str
      str.value = val
    }
    return {
      msg1,
      handle1,
      handleS,
      msg2,
      str
    }
  },
  // 第二步 注册子组件
  components: {
    child
  }
})
</script>
