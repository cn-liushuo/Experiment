<template>
  <el-container class="layout-container-demo" style="height: 500px">
    <el-aside width="200px">
      <el-menu
        :default-active="$route.path"
        active-text-color="#ffd04b"
        background-color="#545c64"
        class="el-menu-vertical-demo"
        router
        text-color="#fff"
        @close="handleClose"
        @open="handleOpen"
      >
        <el-menu-item index="/home/about">
          <el-icon>
            <icon-menu/>
          </el-icon>
          <span>首页</span>
        </el-menu-item>
      </el-menu>
    </el-aside>

    <el-container>
      <el-header style="text-align: right; font-size: 12px">
        <div class="toolbar">
          <el-dropdown>
            <el-icon style="margin-right: 8px; margin-top: 1px">
              <setting/>
            </el-icon>
            <template #dropdown>
              <el-dropdown-menu>
                <el-dropdown-item>View</el-dropdown-item>
                <el-dropdown-item>Add</el-dropdown-item>
                <el-dropdown-item>Delete</el-dropdown-item>
              </el-dropdown-menu>
            </template>
          </el-dropdown>
          <span>Tom</span>
        </div>
      </el-header>

      <el-main>
        <!-- 路由的出口 -->
        <router-view/>
      </el-main>
    </el-container>
  </el-container>
</template>

<script lang="ts" setup>
import {Menu as IconMenu, Setting} from '@element-plus/icons-vue'

const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}

</script>

<style scoped>


.el-container.is-vertical {
  height: 100vh;
  box-sizing: border-box;

}

.el-main {
  padding: 10px !important;
  box-sizing: border-box;
}

.el-aside {
  height: 100vh !important;
  background-color: #545c64 !important;
}

.layout-container-demo .el-header {
  position: relative;
  background-color: var(--el-color-primary-light-7);
  color: var(--el-text-color-primary);
}

.layout-container-demo .el-aside {
  color: var(--el-text-color-primary);
  background: var(--el-color-primary-light-8);
}

.layout-container-demo .el-menu {
  border-right: none;
}

.layout-container-demo .el-main {
  padding: 0;
}

.layout-container-demo .toolbar {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  height: 100%;
  right: 20px;
}
</style>
