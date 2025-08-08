package com.java.demo2map;

import java.util.HashMap;
import java.util.Map;

public class MapTraverseDemo5 {
    public static void main(String[] args) {
        // 掌握Map集合的遍历方式三：lambda
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map);

        // 1、直接调用Map集合的forEach方法完成遍历
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + "=" + value);
//            }
//        });

        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
