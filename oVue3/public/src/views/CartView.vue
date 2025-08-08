<!-- 
  实现购物车功能：购物车页面布局参考京东。列表布局，显示商品图片、商品名称、商品单价、购买数量、删除、单品总价、总价、清空、结算。以下功能或要求实现无明显bug加分，80分为录用标准 
  可以自由安装使用熟悉的ui库，该项目使用pnpm为包管理器请勿使用npm 安装包命令 pnpm add <包名> 如 pnpm add tdesign-vue-next

  1、点击主页加入购物车按钮 应在本页面显示对应的商品 （10分）
  2、购买数量可修改，不可大于商品数量 （10分）
  3、相同的产品 重复添加后对应数量加一 （25分）
  4、点击删除按钮后删除购物车中对应的商品，点击清空按钮清空购物车 （10分）
  5、以上操作购物车总价 单品总价实时更新 （25分）
  6、额外加分项：代码工整规范（5分） TS类型正确（5分） 变量方法命名准确无歧义（5分） 使用pinia（5分） 实现结算功能（即点击后主页对应的商品数量减少）（20分）

-->

<script lang="ts" setup>
import type {Goods} from '@/type'
import type {TableInstance} from 'element-plus'
import {useGoodsStore} from '@/stores/goods'
import {onMounted, ref, watchEffect} from 'vue'

const goodsStore = useGoodsStore()
const multipleTableRef = ref<TableInstance>()
const multipleSelection = ref<Goods[]>([])
const totalPrice = ref(0)

// 监听
watchEffect(() => {
  if (multipleSelection.value) {
    totalPrice.value = 0
    multipleSelection.value.forEach(item => {
      totalPrice.value += item.money * item.shopCount
    })
  }
})

const del = (val: any) => {
  if (val.length > 0) {
    val.forEach((item: any) => {
      goodsStore.delGoods(item)
    })
  } else {
    goodsStore.delGoods(val)
  }
  // 重新渲染列表
  getList()
}

onMounted(() => {
  getList()
})

let getList = () => {
  tableData.value = goodsStore.goods.filter(item => item.shopCount > 0)
}

const tableData: any = ref([])

const handleChange = (value: any) => {
  // console.log(value)
  if (value.shopCount > 0) {
    goodsStore.GetInput(value)
  }
}

// 全选
const allSelection = () => {
  multipleTableRef.value!.toggleAllSelection()
}

// 删除选中的商品
const handleSelectionChange = (val: Goods[]) => {
  multipleSelection.value = val
  console.log(multipleSelection.value)
}
</script>

<template>
  <div class="main">
    <el-table ref="multipleTableRef" :data="tableData" style="width: 100%" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55"/>
      <el-table-column label="商品">
        <template #default="scope">
          <div class="shop">
            <img :src="scope.row.image" alt="" style="width: 80px">
            <span>{{ scope.row.name }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="单价" property="money"/>
      <el-table-column label="数量" property="money">
        <template #default="scope">
          <el-input-number v-model="scope.row.shopCount" :min="1" @change="handleChange(scope.row)"/>
        </template>
      </el-table-column>
      <el-table-column label="小计">
        <template #default="scope">
          <span>￥{{ scope.row.money * scope.row.shopCount }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作">
        <template #default="scope">
          <el-button type="danger" @click="del(scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
  <div class="btn">
    <div>
      <el-button @click="allSelection()">全选</el-button>
      <el-button @click="del(multipleSelection)">删除选中商品</el-button>
      <el-button @click="del(tableData)">清空</el-button>
    </div>
    <div>
      <span>已选则{{ multipleSelection.length }}件商品</span>
      <span>总计{{ totalPrice }}元</span>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.main {
  padding: 20px;
}

.btn {
  width: 90%;
  position: absolute;
  bottom: 0;
  display: flex;
  justify-content: space-between;
  padding: 20px 0;
}

.shop {
  display: flex;
  align-items: center;
}
</style>
