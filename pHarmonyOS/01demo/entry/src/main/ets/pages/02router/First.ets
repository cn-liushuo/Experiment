import { router } from '@kit.ArkUI';

@Entry
@Component
struct First {
  @State message: string = '第一个页面';

  build() {
    Row() {
      Column() {
        Text(this.message)
          .fontSize(50)
          .fontWeight(500)
        Button('点击跳转')
          .fontSize(30)
          .width('60%')
          .height('200px')
          .onClick(() => {
            router.pushUrl({
              // 查看路由配置目录 src\main\resources\base\profile\main_pages.json
              url: 'pages/02router/two',
              // 传参
              params: {
                id: 666
              }
            })
          })
      }
      .width('100%')
    }
  }
}