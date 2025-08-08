@Entry
@Component
struct Img {
  @State message: string = 'Hello World';

  build() {
    Row(){
      // 滚动
      Scroll() {
        Column() {
          Text('图片')
            .fontSize(50)

          // 水平线
          Divider()
            .backgroundColor('red')
            .margin(20)
          // 网络图片
          Image('https://th.bing.com/th/id/R.515d1d3539fcfb520148cef00f9f761b?rik=SUSp0uWyyqfbkA&riu=http%3a%2f%2fpic1.bbzhi.com%2fdongwubizhi%2fxiaogougoudejiaoyou%2fanimal_mx069_pretty_puppies_puppy_garden_adventure_15213_4.jpg&ehk=9DohWv4PdM7NiDO9%2fOAggW%2bgCsdEqNy%2fLdYMglHEMCQ%3d&risl=&pid=ImgRaw&r=0')
            .width('100%')
          // 本地图片 $r() 图片只能放在 src/main/resources/base/media/ 通过app.media.图片名 去找，名字不能重复，后缀名不一样也不行
          Image($r('app.media.startIcon'))
            .width('100%')
          // 本地图片 $rawfile() 图片只能放在src/main/resources/rawfile
          Image($rawfile('cat.jpg'))
            .width('100%')
        }
      }
    }.width('100%')
  }
}