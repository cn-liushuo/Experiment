// 定义一个外部变量 用var let const声明
let state: boolean = true
let name: string = "于浩天爱吃饺子"
@Entry
@Component
struct DataType01 {
  // @State 声明的是一个响应式数据
  @State message: string = 'Hello World';
  // 内部变量，不需要用let var等关键字
  arr: string[] = ["几成新", "霍族郑"]

  build() {
    Row() {
      Column() {
        // 内部变量必须用this去调用
        Text(this.arr[0])
          .fontSize(30)
        // 外部变量不需要用this去调用
        Text(name)
        Button('改变').onClick(() => {
          // 不用@State声明的变量不是一个响应式
          this.arr[0] = "竹筏超"
        })
      }
      .width('100%')
    }
  }
}