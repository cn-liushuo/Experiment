<script lang="ts" setup>
import {useGoodsStore} from '@/stores/goods'

const goodsStore = useGoodsStore()

function addCart(g: any) {
  // 实现添加购物车操作
  goodsStore.GetAddCart(g)
}
</script>

<template>
  <main>
    <h1>Home</h1>
    <div class="box">
      <div v-for="g in goodsStore.goods" :key="g.id" class="item">
        <img :src="g.image">
        <h3>{{ g.name }}</h3>
        <p>￥{{ g.money }}----Count：{{ g.count }}</p>
        <div class="item-footer">
          <button @click="addCart(g)">Add to Cart</button>
        </div>
      </div>
    </div>
  </main>
</template>

<style scoped>
.box {
  display: flex;
  margin-top: 64px;
}

.item {
  width: 24%;
  margin-right: 16px;
  border: 1px solid gray;
  padding: 8px;
}

.item img {
  width: 100%;
  height: 474px;
}

.item-footer {
  text-align: right;
}
</style>
