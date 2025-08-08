@Entry
@Component
struct Components {
  @State message: string = 'Hello World';

  build() {

    Row() {
      Column(){
        // 调用组件
        item()
        // 传参 参数名要和private定义的名字对应起来
        item({
          content: "今天就要放假了"
        })
        item()
        item()
      }
      .width('100%')
    }
    .height('100%')
  }
}

// 重复代码太多，于是要封装，不一样的弄成变量传进去
// 定义外部组件
@Component
// 组件名叫 item
struct item {
  //
  @State isOk: boolean = true;
  // private 定义接收传进来的变量
  private  content: string = "我爱学习";
  // 构建页面，build里必须有一个根元素
  build() {
    Row() {
      Row() {
        Image($rawfile('tb.gif'))
          .width(20)
          .height(20)
        Text(this.content)
          .margin({
            left: 10
          })
        // 元素添加下划线
          .decoration({
            // 三元运算符
            type: this.isOk ? TextDecorationType.LineThrough : TextDecorationType.None
          })
      }
      .padding({
        top: 10,
        left: 10,
        right: 10,
        bottom: 10
      })
      .backgroundColor('#f5c2cd')
      .borderRadius(10)
      .margin({
        top: 10
      })
      .onClick(() => {
        this.isOk = !this.isOk
      })
    }
  }
}