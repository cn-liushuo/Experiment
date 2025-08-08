@Entry
@Component
struct Poem {
  @State message: string = 'Hello World';

  build() {
    Row(){
      Column() {
        Text(this.message)
          .fontSize(50)
          .fontWeight(700)

        Row() {
          Image($rawfile('tb.gif'))
            .width(20)
            .height(20)
          Text('我要努力学习')
            .margin({
              left: 10
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

        Row() {
          Image($rawfile('tb.gif'))
            .width(20)
            .height(20)
          Text('我要努力学习')
            .margin({
              left: 10
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

        Row() {
          Image($rawfile('tb.gif'))
            .width(20)
            .height(20)
          Text('我要努力学习')
            .margin({
              left: 10
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

        Row() {
          Image($rawfile('tb.gif'))
            .width(20)
            .height(20)
          Text('我要努力学习')
            .margin({
              left: 10
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
      }
      .width('100%')
    }
    .height('100%')
  }
}