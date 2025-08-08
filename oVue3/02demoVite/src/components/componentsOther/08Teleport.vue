<template>
  <button @click="isOk = true">打开一个对话框</button>

  <Teleport v-if="isOk" to="body">
    <div class="box">
      <div>
        <span>这是个对话框</span>
        <button @click="isOk = false">关闭</button>
      </div>
    </div>
  </Teleport>
</template>

<script lang="ts" setup>
import {ref} from 'vue';


let isOk = ref(false)


</script>
<style lang="scss" scoped>
.box {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: rgba(0, 0, 0, 0.3);
  display: flex;
  justify-content: center;
  align-items: center;

  div {
    width: 300px;
    height: 300px;
    padding: 10px;
    background: #fff;
  }
}
</style>
