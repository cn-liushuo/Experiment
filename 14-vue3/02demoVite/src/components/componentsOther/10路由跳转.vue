<script lang="ts" setup>
// this.$router.push
// import router from '@/router'
import {useRouter} from "vue-router";

const router = useRouter()
let jump = () => {
  router.push({
    path: "/home/fragment",
    query: {
      name: "huo",
      id: "250"
    }
  })
  // 不推荐使用params传参 参数会丢失
  // router.push({
  //   name: "fragment",
  //   params: {
  //     name: "huo",
  //     id: "250"
  //   }
  // })
}
</script>

<template>
  <button @click="jump">点击跳转到fragment</button>
</template>

<style lang="scss" scoped>

</style>
