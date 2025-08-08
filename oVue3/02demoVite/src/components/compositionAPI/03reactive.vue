<template>
  <h1>reactive</h1>
  <ul>
    <li>姓名--{{ user.userName }}</li>
    <li>年龄--{{ user.age }}</li>
    <li>性别--{{ user.sex }}</li>
  </ul>
  <button @click="handleClick">更新数据</button>
</template>
<script lang="ts">
import {defineComponent, reactive} from 'vue';

export default defineComponent({
  setup() {
    // 普通对象  目标对象
    let obj = {
      userName: "孙悟空",
      age: 22,
      stu: {
        stuName: "花果山",
        arr: [1, 2, 3]
      }
    }
    // reactive 定义多个数据的响应式  返回的是一个proxy代理对象，被代理者是目标对象
    // user 代理对象  是响应式数据  上边的obj是目标对象 不是响应式数据
    // let user = reactive(obj);
    let user: any = reactive(obj);

    let handleClick = () => {
      // 改变目标对象 视图没有发生变化  因为目标对象不是响应式数据
      // obj.userName += '6'
      // console.log(obj.userName,'userName')

      // console.log(user,'user')
      // user.age++

      // 直接给代理对象添加属性会有问题  因为对象中原有属性因为类型推论的存在自动加上数据类型，后添加的属性不会自动加上数据类型  所以可以直接给user加属性类型
      user.sex = '男'

    }
    return {
      obj,
      handleClick,
      user
    }
  }
})
</script>
