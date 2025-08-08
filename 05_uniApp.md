#### 1、简单说一下 uni-app？

uni-app 是一个使用 Vue.js 开发所有前端应用的框架，开发者编写一套代码，可发布到
ios、android、h5，以及各种小程序（微信/支付宝/百度/头条/QQ/钉钉）等多个平台

#### 2、uni-app 生命周期？

1、uni-app 应用的生命周期：  
①、onLaunch：初始化完成时触发，全局只触发一次  
②、onShow：当 uni-app 启动时，或从后台进入前台显示  
③、onHide：当 uni-app 从前台进入后台  
④、onError：当 uni-app 报错时触发  
2、uni-app 页面的生命周期  
①、onLoad：监听页面加载，参数为上个页面传递的参数，传递的类型为对象  
②、onReady：监听页面首次渲染完成  
③、onShow：监听页面显示  
④、onHide：监听页面隐藏  
⑤、onUnload：监听而页面卸载  
⑥、onPullDownRefresh：监听用户下拉动作，一般用于下拉刷新  
⑦、onReachBottom：页面滚动到底部的事件，上拉加载

#### 3、uni-app 的优缺点

1、优点;  
①、一套代码可以生成多端  
②、学习成本低，语法是 vue 的，组件是小程序的  
③、拓展能力强  
④、使用 HBuilderX 开发，支持 vue 语法  
⑤、突破了系统对 H5 调用原生能力的限制  
2、缺点：  
①、问世时间短，很多地方不完善  
②、社区不大  
③、官方对问题的反馈不及时  
④、在 Android 平台上比微信小程序和 ios 差  
⑤、文件命名受限

#### 4、小程序、uni-app 中的本地数据存储和接收？

1、微信小程序：  
存储：通过 wx.setStorage/wx.setStorageSync 写数据到缓存  
接收：通过 wx.getStorage/wx.getStorageSync 读取本地缓存  
2、uni-app：  
存储：uni.setStorage({key: "属性名",data:"值"})  
接收：uni.getStorage({key: "属性名", success(res){res.data}})

#### 5、简述 rpx、px、em、rem、%、vh、vw 的区别

1、rpx：相当于把屏幕分成 750 份，1 份就是 1rpx，100rpx = 50px  
2、px：绝对单位，页面按精确像素展示  
3、em：相对单位，相对于它的父节点字体进行计算  
4、rem：相对单位，相对根节点 html 的字体大小来计算  
5、%：一般来说就是相对于父元素  
6、vh：视窗高度，1vh 等于视窗高度的 1%  
7、vw：视窗宽度，1vw 等于视窗宽度的 1%

#### 6、js、vue、uni-app、小程序的页面传参方式区别

1、js 传参  
通过 url 拼接参数进行传参  
接收通过 location.href  
2、vue 传参  
vue 可以通过标签 router-link 跳转传参  
也可以通过事件里的 this.$router.push({}) 跳转传参，传参有两种 params 和 query  
接收 this.$route.params、this.$route.query 接收  
3、小程序传参  
通过跳转路径后面拼接参数来进行跳转传参

#### 7、uni-app 解决跨端兼容问题？

```html
<!-- #ifdef H5 -->
代码只在 H5 显示
<!-- #endif -->

<!-- #ifdef MP-WEIXIN -->
代码只在微信小程序显示
<!-- #endif -->
```

### 8、uni-app 适配刘海屏

https://www.cnblogs.com/moranjl/p/15739275.html  
当navigationStyle设为custom或titleNView设为false时，原生导航栏不显示，此时要注意几个问题：  
官方提供了一个CSS变量可以直接引用：  
var(--status-bar-height)  
该变量自动匹配设备平台状态栏高度  
此变量可以用calc() 加上其他单位数值来使用