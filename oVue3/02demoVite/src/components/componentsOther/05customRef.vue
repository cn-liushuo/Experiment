<template>
  <h1>customRef</h1>
  <input id="" v-model="key" name="" type="text"/>
  {{ key }}
</template>
<script lang="ts" setup>
import {customRef} from "vue";

// customRef自定义ref， 去创建一个自定义的ref
/* 防抖
        var timer = null;
		btn.onclick = function () {
			// 先清除上一次的延时器
			clearTimeout(timer);
			// 每一次点击延迟触发
			timer = setTimeout(function () {
				console.log('呀吼');
			}, 1000)
		}

    */
function fangdouRef<T>(value: T, delay = 200) {
  let timer: any;
  // 创建一个自定义的ref
  return customRef((track, trigger) => {
    return {
      // 获取数据
      get() {
        // 告诉vue追踪数据key
        track();
        return value;
      },
      // 修改
      set(newVal) {
        // 保留最后一次延时器
        clearTimeout(timer);
        timer = setTimeout(() => {
          // 将新数据赋值给value
          value = newVal;
          // trigger 更新页面
          trigger();
        }, delay);
      },
    };
  });
}

let key = fangdouRef<string>("huohuo", 2000);

const fun = <T>(a: T): T => {
  return a;
};

fun<string>("huohuo");
</script>
