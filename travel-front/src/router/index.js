import Vue from 'vue'
import Router from 'vue-router'
import Index from '../view/Index'
import ScenicSpoit from '../view/ScenicSpoit'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'ScenicSpoit',
      component: ScenicSpoit
    }
  ]
})
