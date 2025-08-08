import { router } from '@kit.ArkUI';

@Entry
@Component
struct Two {
  @State message: string = '第二个页面';
  @State params: object = router.getParams(); // as {FormPage: string, PageDate: string
  // @State Msg: number = router.getParams().['id'];
  build() {
    RelativeContainer() {
      // Text(this.message)
      Text(`${this.params['id']}`)
        .fontSize(50)
      Button('返回')
        .onClick(() => {
          router.back()
        })
    }
    .height('100%')
    .width('100%')
  }
}