<template>
  <view class="about">
    <text>{{ msg }}</text>
  </view>
</template>

<script>
import { ref } from 'vue'
import './about.scss'

export default {
  setup () {
    const msg = ref('About Home')
    return {
      msg
    }
  }
}
</script>
