package com.java.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo3 {
    public static void main(String[] args) {
        // 掌握Map集合的遍历方式一：键找值
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map);

        // 1、提取Map集合的全部键到一个Set集合中去
        Set<String> keys = map.keySet();

        // 2、遍历Set集合，获取每一个键
        for (String key : keys) {
            // 3、根据键获取值
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
