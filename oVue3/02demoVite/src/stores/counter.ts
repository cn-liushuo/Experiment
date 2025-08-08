import {ref, computed} from 'vue'
import {defineStore} from 'pinia'

// Option Store
export const useCounterStore = defineStore('counter', {
  state: () => ({count: 0, name: 'Eduardo'}),
  getters: {
    doubleCount: (state) => state.count * 2,
  },
  actions: {
    increment() {
      this.count++
    },
  },
  persist: {
    // 开启存储
    enabled: true,
    // 配置持久化存储
    strategies: [
      {
        // 本地存储的 key 名，可以省略，默认是 defineStore 的第一个参数
        key: "my",
        // 指定存储的位置 默认是绘画存储sessionStorage
        storage: localStorage,
        // paths 是个数组，可以写多个
        paths: ['count', 'name']
      }
    ]
  }
})

// Setup Store
// export const useCounterStore = defineStore('counter', () => {
//   const count = ref(0)
//   const doubleCount = computed(() => count.value * 2)
//
//   function increment() {
//     count.value++
//   }
//
//   return {count, doubleCount, increment}
// })
