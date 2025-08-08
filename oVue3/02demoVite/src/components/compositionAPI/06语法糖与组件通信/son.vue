<script lang="ts" setup>
/*
* 引入组合式 api
* defineProps: 相当于 setup 函数中第一个参数 props
* useAttrs: 相当于 setup 函数中的第二个参数的 attrs
* defineEmits: 相当于 setup 函数中的第二个参数的 emit
* defineExpose: 将组件中变量或者方法导出，然后通过 ref 获取组件实例的方法，获取导出的数据
* defineOptions: 可是使用 vue2 的语法
* */
import {ref, defineProps, useAttrs, defineEmits, defineExpose, defineOptions} from "vue"

// 父传子开始
const props = defineProps({
  msg1: {
    type: String,
  },
  msg2: {
    type: String,
  }
})

const attrs = useAttrs()
console.log(attrs, "attrs")
// 父传子结束

// 子传父开始
let son1 = ref("大儿子给父亲买了根烤肠")
let son2 = ref("大儿子给父亲买了包泡面")
// 发送数据
let emit = defineEmits(["handleA", "handleB"])
let handleClick = () => {
  emit("handleA", son1.value)
  emit("handleB", son2.value)
}
// 子传父结束

let son3 = ref("三儿子买了个奔驰")
let handleY = (val: string) => {
  console.log("三儿子天天胡扯", val)
}
//将儿子当中的变量和方法导出
defineExpose({
  son3, handleY
})

//使用 vue2 语法
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

<template>
  <div class="son">
    <h1>子组件</h1>
    <p>准备接受父组件传递来的msg系列---{{ props.msg1 }}---{{ msg2 }}</p>
    <p>展示attrs---{{ attrs.count }}</p>

    <button @click="handleClick">发送数据</button>
    <p>{{ list }}</p>
  </div>
</template>

<style lang="scss" scoped>
.son {
  background-color: pink;
}
</style>
