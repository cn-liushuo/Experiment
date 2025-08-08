<template>
  <view>
    <swiper class="card-swiper" :class="dotStyle?'square-dot':'round-dot'" :indicator-dots="true" :circular="true"
            :autoplay="true" interval="5000" duration="500" @change="cardSwiper" indicator-color="#8799a3"
            indicator-active-color="#0081ff">
      <swiper-item v-for="(item,index) in swiperList" :key="index" :class="cardCur==index?'cur':''">
        <view class="swiper-item">
          <image :src="item.url" mode="aspectFill" v-if="item.type=='image'"></image>
          <video :src="item.url" autoplay loop muted :show-play-btn="false" :controls="false"
                 objectFit="cover" v-if="item.type=='video'"></video>
        </view>
      </swiper-item>
    </swiper>
    <button class="cu-btn bg-green shadow" @tap="LoadModal">
      点我
    </button>
    <view class="cu-load load-modal" v-if="loadModal">
      <!-- <view class="cuIcon-emojifill text-orange"></view> -->
      <image src="/static/ji.png" mode="aspectFit"></image>
      <view class="gray-text">小飞机来了...</view>
    </view>

    <view class="login">
      <uni-forms>
        <uni-forms-item label="用户名" required>
          <uni-easyinput v-model="userName" placeholder="请输入姓名"/>
        </uni-forms-item>
        <uni-forms-item label="密码" required>
          <uni-easyinput type="password" v-model="passWord" placeholder="请输入姓名"/>
        </uni-forms-item>

        <button @click="login">登录</button>
      </uni-forms>
    </view>
  </view>
</template>

<script>
import {login} from "@/api/login.js"

export default {
  data() {
    return {
      passWord: '123456',
      userName: 'admin',
      cardCur: 0,
      swiperList: [{
        id: 0,
        type: 'image',
        url: 'https://ossweb-img.qq.com/images/lol/web201310/skin/big84000.jpg'
      }, {
        id: 1,
        type: 'image',
        url: 'https://ossweb-img.qq.com/images/lol/web201310/skin/big37006.jpg',
      }, {
        id: 2,
        type: 'image',
        url: 'https://ossweb-img.qq.com/images/lol/web201310/skin/big39000.jpg'
      }, {
        id: 3,
        type: 'image',
        url: 'https://ossweb-img.qq.com/images/lol/web201310/skin/big10001.jpg'
      }, {
        id: 4,
        type: 'image',
        url: 'https://ossweb-img.qq.com/images/lol/web201310/skin/big25011.jpg'
      }, {
        id: 5,
        type: 'image',
        url: 'https://ossweb-img.qq.com/images/lol/web201310/skin/big21016.jpg'
      }, {
        id: 6,
        type: 'image',
        url: 'https://ossweb-img.qq.com/images/lol/web201310/skin/big99008.jpg'
      }],
      dotStyle: false,
      towerStart: 0,
      direction: '',
      loadModal: false,
    }
  },
  methods: {
    LoadModal(e) {
      this.loadModal = true;
      setTimeout(() => {
        this.loadModal = false;
      }, 2000)
    },
    cardSwiper(e) {
      this.cardCur = e.detail.current
    },
    login() {
      login({
        userName: this.userName,
        passWord: this.passWord
      }).then(res => {
        console.log(res)
        if (res.data.code == 200) {
          uni.setStorageSync('token', res.data.data.token)
          uni.navigateTo({
            url: '/pages/list/list'
          })
        }
      })
      // uni.request({
      // 	url: "http://wish.byesame.com/login",
      // 	method: 'POST',
      // 	data: {
      // 		userName: this.userName,
      // 		passWord: this.passWord
      // 	},
      // 	success: (res) => {
      // 		console.log(res)
      // 	}
      // })
    }
  }
}
</script>

<style>

</style>
