<template>
  <div class="son">
    <h1>我是子组件</h1>
    <p>看看爸爸给我个啥---{{ msg1 }}---{{ msg2 }}</p>
    <p>展示一下son---{{ son }}</p>

    <slot :obj="obj" name="abc"></slot>
  </div>
</template>
<script lang="ts">
import {defineComponent, ref} from "vue"

export default defineComponent({
  props: {
    msg1: {
      type: String
    },
    // msg2:{
    //     type:String
    // }
  },
  /*
      setup(props,content)
      参数1：props 是个对象  这个对象中存着父组件向子组件传递的数据
      参数2： 是一个对象  里边有三个常用的方法
          attrs:相当于vue2中的this.$attrs 获取父组件中向子组件绑定的自定义属性  注意跟props冲突 有他没我
          emit: 相当于this.$emit
          slots: 插槽传参
  */
  setup({msg1}, {attrs, emit, slots}) {
    console.log(msg1, 'props')
    // console.log(msg2,'props')
    console.log(attrs, 'attrs')

    let son = ref('儿子要给爸爸娶个儿媳妇')
    // 子传父
    emit('hanldeSon', son.value)


    let obj = ref({
      name: "悟空",
      age: 18
    })
    return {
      son,
      obj
    }
  }
})
</script>
<style scoped>
.son {
  background-color: yellow;
}
</style>
