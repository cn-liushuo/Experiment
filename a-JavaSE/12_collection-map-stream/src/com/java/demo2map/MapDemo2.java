package com.java.demo2map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        // 掌握Map的常用方法
        Map<String, Integer> map = new HashMap<>(); // 一行经典代码
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        map.put(null, null);
        System.out.println(map); // {null=null, 嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}

        // 写代码演示常用方法
        System.out.println(map.get("嫦娥")); // 根据键取值 28
        System.out.println(map.get("嫦娥2")); // 根据键取值 null

        System.out.println(map.containsKey("嫦娥")); // 判断键是否包含某个键 true
        System.out.println(map.containsKey("嫦娥2")); // false

        System.out.println(map.containsValue(28)); // 判断值是否包含某个值 true
        System.out.println(map.containsValue(28.0)); // false

        System.out.println(map.remove("嫦娥")); // 根据键删除键值对，并返回被删除的键值对的值
        System.out.println(map); // {null=null, 铁扇公主=38, 紫霞=31}

        // map.clear(); // 清空map
        System.out.println(map);

        System.out.println(map.isEmpty()); // 判断map是否为空

        System.out.println(map.size()); // 获取map中键值对的个数

        // 获取所有的键放到一个Set集合返回给我们
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // 获取所有的值放到一个Collection集合返回给我们
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
