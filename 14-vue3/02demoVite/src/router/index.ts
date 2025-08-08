import {createRouter, createWebHistory} from "vue-router";
import HomeView from "../views/HomeView.vue";

//
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      // 重定向
      redirect: "/home",
    },
    {
      path: "/home",
      name: "home",
      // 访问/home 跳转到about页面
      redirect: "/home/about",
      component: HomeView,
      children: [
        {
          // 子路由不要加/
          path: "about",
          name: "about",
          component: () => import("../components/compositionAPI/01setup.vue"),
        },
        {
          // 子路由不要加/
          path: "ref",
          name: "ref",
          component: () => import("../components/compositionAPI/02ref.vue"),
        },
        {
          path: "reactive",
          name: "reactive",
          component: () =>
            import("../components/compositionAPI/03reactive.vue"),
        },
        {
          path: "refReactive",
          name: "refReactive",
          component: () =>
            import("../components/compositionAPI/04ref和reactive.vue"),
        },
        {
          path: "setUp",
          name: "setUp",
          component: () =>
            import(
              "../components/compositionAPI/05setup函数以及组件通信/index.vue"
              ),
        },
        {
          path: "setUp1",
          name: "setUp1",
          component: () =>
            import(
              "../components/compositionAPI/06语法糖以及组件通信/index.vue"
              ),
        },
        {
          path: "computed",
          name: "computed",
          component: () =>
            import("../components/compositionAPI/07computed.vue"),
        },
        {
          path: "watch",
          name: "watch",
          component: () => import("../components/compositionAPI/08watch.vue"),
        },
        {
          path: "life",
          name: "life",
          component: () =>
            import("../components/compositionAPI/09lifecycle.vue"),
        },
        {
          path: "refDom",
          name: "refDom",
          component: () =>
            import("../components/compositionAPI/11ref获取dom.vue"),
        },
        {
          path: "torefs",
          name: "torefs",
          component: () => import("../components/compositionAPI/12toRefs.vue"),
        },
        {
          path: "hook",
          name: "hook",
          component: () =>
            import("../components/compositionAPI/13hook/index.vue"),
        },
        {
          path: "shallow",
          name: "shallow",
          component: () =>
            import(
              "../components/componentsOther/01shallowRef和shallowReactive.vue"
              ),
        },
        {
          path: "readonly",
          name: "readonly",
          component: () =>
            import(
              "../components/componentsOther/02readonly和shallowReadonly.vue"
              ),
        },
        {
          path: "toRaw",
          name: "toRaw",
          component: () =>
            import("../components/componentsOther/03toRaw和markRaw.vue"),
        },
        {
          path: "toRef",
          name: "toRef",
          component: () => import("../components/componentsOther/04toRef.vue"),
        },
        {
          path: "customRef",
          name: "customRef",
          component: () =>
            import("../components/componentsOther/05customRef.vue"),
        },
        {
          path: "isTrue",
          name: "isTrue",
          component: () =>
            import("../components/componentsOther/06响应式数据的判断.vue"),
        },
        {
          path: "Fragment",
          name: "Fragment",
          component: () =>
            import("../components/componentsOther/07Fragment.vue"),
        },
        {
          path: "teleport",
          name: "teleport",
          component: () =>
            import("../components/componentsOther/08Teleport.vue"),
        },
        {
          path: "provide_inject",
          name: "provide_inject",
          component: () => import("../components/componentsOther/09provide和inject/index.vue")
        },
        {
          path: "jump",
          name: "jump",
          component: () => import("../components/componentsOther/10路由跳转.vue")
        },
        {
          path: "pinia",
          name: "pinia",
          component: () => import("../components/componentsOther/11pinia.vue")
        }
      ],
    },
    {
      path: '/home/about/detail',
      name: 'hi',
      component: HomeView,
      children: [
        {
          // :id /:名字 表示等待传入的值，字段名就是起的名字
          // (\d+) 正则表达式，表示匹配数字
          path: 'hello/:id(\\d+)',
          name: 'hello',
          component: () => import('../views/HiView.vue')
        }
      ]
    }
  ],
});

export default router;
