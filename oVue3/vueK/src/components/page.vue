<template>
  <el-pagination
    v-model:current-page="pageParam!.page"
    v-model:page-size="pageParam!.rows"
    :background="background"
    :disabled="disabled"
    :page-sizes="[10, 20, 30, 40]"
    :size="size"
    :total="total"
    layout="total, sizes, prev, pager, next, jumper"
    @size-change="handleSizeChange"
    @current-change="handleCurrentChange"
  />

</template>

<script lang="ts" setup>
import type {ComponentSize} from 'element-plus'
import {defineEmits, defineProps, ref} from 'vue';
// 接收

const props = defineProps({
  total: {
    type: Number,
    // 默认值
    default: 0
  },
  pageParam: {
    type: Object
  }
})

const size = ref<ComponentSize>('default')
const background = ref(true)
const disabled = ref(false)
// 子传父  自定义了一个emit，里面是一个数组，放的是定义的若干自定义方法
const emit = defineEmits(['pageChange', 'rowChange'])
const handleSizeChange = (val: number) => {
  emit('pageChange', val)
}
// 切换页码触发
const handleCurrentChange = (val: number) => {
  emit('rowChange', val)
}
</script>
