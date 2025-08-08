import {createRouter, createWebHistory} from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      redirect: "/login"
    },
    {
      path: '/home',
      name: 'home',
      component: HomeView,
      redirect: "/home/about",
      children: [
        {
          path: 'about',
          name: 'about',
          component: () => import('../views/AboutView.vue'),
        }
      ]
    },
    {
      path: "/login",
      component: () => import('../views/login.vue'),
    }
  ],
})

export default router
