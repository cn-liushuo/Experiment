<template>
  <div class="common-layout">
    <el-container>
      <el-aside width="300px">
        <el-menu
          :default-active="$route.path"
          active-text-color="#FF0004"
          class="el-menu-vertical-demo"
          router
          @close="handleClose"
          @open="handleOpen"
        >
          <el-sub-menu index="/home">
            <template #title>
              <el-icon>
                <location/>
              </el-icon>
              <span>CompositionAPI 组合式API</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="/home/about">setup</el-menu-item>
              <el-menu-item index="/home/ref">ref</el-menu-item>
              <el-menu-item index="/home/reactive">reactive</el-menu-item>
              <el-menu-item index="/home/refReactive">ref和reactive</el-menu-item>
              <el-menu-item index="/home/setUp">setup函数和通信</el-menu-item>
              <el-menu-item index="/home/setUp1">语法糖和组件通信</el-menu-item>
              <el-menu-item index="/home/computed">计算属性</el-menu-item>
              <el-menu-item index="/home/watch">监听属性</el-menu-item>
              <el-menu-item index="/home/life">生命周期</el-menu-item>
              <el-menu-item index="/home/refDom">ref获取dom</el-menu-item>
              <el-menu-item index="/home/torefs">toRefs</el-menu-item>
              <el-menu-item index="/home/hook">hook</el-menu-item>
            </el-menu-item-group>
          </el-sub-menu>
          <el-sub-menu index="/other">
            <template #title>
              <el-icon>
                <location/>
              </el-icon>
              <span>CompositionAPI 其他组合式API</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="/home/shallow">shallow</el-menu-item>
              <el-menu-item index="/home/readonly">readonly</el-menu-item>
              <el-menu-item index="/home/toRaw">toRaw和markRaw</el-menu-item>
              <el-menu-item index="/home/toRef">toRef</el-menu-item>
              <el-menu-item index="/home/customRef">customRef</el-menu-item>
              <el-menu-item index="/home/isTrue">响应式数据的判断</el-menu-item>
              <el-menu-item index="/home/fragment">Fragment</el-menu-item>
              <el-menu-item index="/home/teleport">Teleport</el-menu-item>
              <el-menu-item index="/home/provide_inject">provide&inject</el-menu-item>
              <el-menu-item index="/home/jump">路由跳转传参</el-menu-item>
              <el-menu-item index="/home/pinia">pinia</el-menu-item>
            </el-menu-item-group>
          </el-sub-menu>

        </el-menu>
      </el-aside>
      <el-main>
        <!-- 路由的出口 -->
        <router-view/>
      </el-main>
    </el-container>
  </div>
</template>

<script lang="ts" setup>
const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
</script>

<style lang="scss" scoped>
::v-deep .el-aside {
  height: 100vh;
}
</style>
