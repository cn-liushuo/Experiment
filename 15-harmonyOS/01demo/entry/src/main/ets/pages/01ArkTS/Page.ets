// @开头 装饰器
// 程序的入口
@Entry
// 组件
@Component
// struct 结构体 放主要内容
struct Page {
  // @State 定义变量
  @State message: string = 'Hello World';
  // 构建页面
  build() {
    // 一行的高度是100%
    Row(){
      // Column 一列的宽度
      Column(){
        // Text 输出文本内容
        Text(this.message)
          // 字体大小
          .fontSize(50)
          // 字体粗细 可以是数字
          // 也可以是通过FontWeight去取值 定义的枚举，取值
          .fontWeight(FontWeight.Bold)
          // 按钮
        Button() {
          Text('提交')
            // 内边距
            .padding(20)
            // 字体颜色
            .fontColor('#ffffff')
        }
        .width(200)
        .onClick(() => {
          if(true) {
            this.message = "竹筏超"
          }else{
            this.message = "于浩天"
          }
        })
      }
      .width('100%')
    }
    .height("100%")
    .width('100%')
  }
}