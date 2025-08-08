<template>
  <div class="son">
    <h1>子组件</h1>
    <p>准备接收父组件传递来的msg系列--{{ msg1 }}---{{ msg2 }}</p>
    <p>展示attrs---{{ attrsss.count }}</p>

    <button @click="handleClick">发送数据</button>
    <p>{{ list }}</p>
  </div>
</template>

<script lang="ts" setup>
/*
    引入组合式api
    defineProps 相当于setup函数中第一个参数props
    useAttrs相当于setup中的第二个参数的attrs
    defineEmits相当于setup中的第二个参数的emit
    defineExpose 将组件中的变量或者方法导出去，然后通过ref获取组件实例的方法获取导出的数据
    defineOptions 方法可以使用vue2的语法
*/
import {ref, defineProps, useAttrs, defineEmits, defineExpose} from "vue"

//父传子开始
const props = defineProps({
  msg1: {
    type: String
  },
  msg2: {
    type: String
  }
})

const attrsss = useAttrs()
console.log(attrsss, 'attrsss')
//父传子结束

// 子传父开始
let son1 = ref('大儿子给父亲买了根烤肠')
let son2 = ref('二儿子给父亲买了包泡面')
// 发送数据
let emit = defineEmits(['handleA', 'handleB'])
let handleClick = () => {
  emit('handleA', son1.value)
  emit('handleB', son2.value)
}
// 子传父结束


let son3 = ref('三儿子买了个奔驰')
let handleY = (val: string) => {
  console.log('三儿子天天胡扯', val)
}
// 将儿子中的变量和方法导出去
defineExpose({
  son3,
  handleY
})

//使用vue2语法
defineOptions({
  data() {
    return {
      list: [1, 2, 3, 4]
    }
  },
  methods: {},
  mounted() {

  }
})
</script>

<style scoped>
.son {
  background-color: yellow;
}
</style>
