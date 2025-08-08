import {ref} from 'vue'
import {defineStore} from 'pinia'
import type {Goods} from '@/type'

export const useGoodsStore = defineStore('goods', () => {
    const goods = ref<Goods[]>([
        {
            id: 1,
            name: 'Apple',
            count: 99,
            counts: 99,
            shopCount: 0,
            image: 'https://ts1.cn.mm.bing.net/th/id/R-C.533c6febe321a45a517ba67e0d9ce09f?rik=tyTb53sMCVXvwQ&riu=http%3a%2f%2fwww.kuaipng.com%2fUploads%2fpic%2fw%2f2022%2f09-08%2f129564%2fwater_129564_698_698_.png&ehk=vyTjjXt7KOjMTgs5p%2bqJDi8%2f50IHWRkfSS86IjfVrPE%3d&risl=&pid=ImgRaw&r=0',
            money: 4999
        },
        {
            id: 2,
            name: 'Xiaomi',
            count: 50,
            counts: 50,
            shopCount: 0,
            image: 'https://tse4-mm.cn.bing.net/th/id/OIP-C.gNBwKYT-Wc_q96urESAhygAAAA?pid=ImgDet&rs=1',
            money: 3699
        },
        {
            id: 3,
            name: 'Vivo',
            count: 10,
            counts: 10,
            shopCount: 0,
            image: 'https://tse2-mm.cn.bing.net/th/id/OIP-C.eVG0LMgh4A89MditYAi5wQHaHa?pid=ImgDet&rs=1',
            money: 2999
        },
        {
            id: 4,
            name: 'Oppo',
            count: 200,
            counts: 200,
            shopCount: 0,
            image: 'https://tse1-mm.cn.bing.net/th/id/OIP-C.5YLyPzAKz9VA537lbv-orAHaHa?pid=ImgDet&rs=1',
            money: 2699
        },
    ])
    const GetAddCart = (good: Goods) => {
        goods.value.find(item => {
            if (item.id == good.id && item.count > 0) {
                item.count--
                item.shopCount++
            }
        })
    }
    const GetInput = (val: any) => {
        goods.value.find(item => {
            if (item.id === val.id) {
                item.count = item.counts - val.shopCount
                item.shopCount = val.shopCount
            }
        })
    }
    const delGoods = (val: any) => {
        goods.value.find(item => {
            if (item.id == val.id) {
                item.count = item.counts
                item.shopCount = 0
            }
        })
    }
    return {goods, GetAddCart, GetInput, delGoods}
})
