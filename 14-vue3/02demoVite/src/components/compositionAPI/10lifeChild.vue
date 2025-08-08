<template>
  <h1>子组件</h1>
</template>

<script lang="ts">
import {defineComponent, onBeforeMount} from 'vue'

export default defineComponent({
  setup() {
    // vue3
    onBeforeMount(() => {

    });
  },
  // vue2
  beforeCreate() {
    console.log("vue2-实例创建之前");

  },
  created() {

  },
  beforeMount() {

  },
  mounted() {

  },

})
</script>
