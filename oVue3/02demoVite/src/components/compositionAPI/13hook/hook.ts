import {ref} from "vue"

export default () => {
  const x = ref(0)
  const y = ref(0)

  const getPosition = (ev: any) => {
    x.value = ev.clientX
    y.value = ev.clientY
  }

  // 一定要返回出去
  return {
    x,
    y,
    getPosition
  }
}
