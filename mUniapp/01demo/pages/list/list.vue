<template>
  <view>
    <uni-badge class="uni-badge-left-margin" :inverted="true" text="123" type="info"/>
    <uni-card :is-shadow="true" v-for="(item, index) in list" :key="index">
      <text class="uni-body">{{ item.name }}</text>
    </uni-card>


  </view>
</template>

<script>
import {
  admin
} from "@/api/login.js"

export default {
  data() {
    return {
      list: []
    }
  },
  methods: {
    getList() {
      admin({
        page: 1,
        rows: 10
      }).then(res => {
        console.log(res)
        this.list = res.data.data.list
      })
    }
  },
  created() {

  },
  onLoad(e) {
    this.getList()
    console.log("===============", e)
  }
}
</script>

<style>

</style>
