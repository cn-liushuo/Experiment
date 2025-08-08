<template>
  <div v-for="(item, index) in list" :key="index">
    <p :class="item.userName != 'zs' ? 'nomy': 'my'">{{ item.userName }}：{{ item.data }}</p>
  </div>
  <div style="position: fixed;bottom: 0;">
    <input v-model="msg" type="text">
    <button @click="send">发送</button>
  </div>
</template>
<script lang="ts" setup>
import {ref} from 'vue';

let websocket: any;
let list = ref([])
let msg = ref('')

// 初始化
function init() {
  websocket = new WebSocket("ws://124.220.152.89:8800/userName=zs")
  //  监听sockt连接
  // websocket.onopen = function(){
  //   console.log("服务器链接成功~~")
  // }
  websocket.onopen = open
  // 监听scoket信息
  websocket.onmessage = message
  // 监听scoket的错误信息
  websocket.onerror = function () {
    console.log("出错了~~~")
  }
  // 监听关闭连接
  websocket.onclose = function () {
    // 服务器断开连接
    websocket.close()
  }
}

// 调用
init()

function open() {
  console.log("服务器链接成功~~")
}

function message(e: any) {
  let obj = JSON.parse(e.data)
  console.log(obj)
  // 赋值聊天列表
  list.value = obj.chatList
}

// 发送数据
function send() {
  websocket.send(JSON.stringify({
    type: 2,
    data: msg.value
  }))
}
</script>

<style lang="scss">
.my {
  float: right;
  text-align: right;
}

.nomy {
  float: left;
}

p {
  width: 100%;
}
</style>
