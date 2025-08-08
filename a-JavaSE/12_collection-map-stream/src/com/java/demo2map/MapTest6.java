package com.java.demo2map;

import java.util.*;

public class MapTest6 {
    public static void main(String[] args) {
        // 目标：完成Map集合的相关案例，投票统计程序.
        calc();
    }

    public static void calc() {
        // 1、把80个学生选择的景点数据拿到程序中来，才可以统计。
        List<String> locations = new ArrayList<>();
        String[] names = {"北京动物园", "大唐不夜城", "故宫", "鸡鸣寺"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(names.length);
            locations.add(names[index]);
        }
        System.out.println(locations);

        // 2、统计每个景点被选择的次数。
        // 最终统计的结果是键值对的形式，所以可以考虑定义一个Map集合来统计结果
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map);

        // 3、遍历80个学生选择的景点，来统计选择的次数。
        for (String location : locations) {
            // 4、判断当前遍历的景点是否再Map集合中存在，如果不存在，说明是第一次出现，如果存在则说明之前统计过。
//            if(map.containsKey(location)) {
//                // 这个景点之前出现过，其值+1
//                map.put(location, map.get(location) + 1);
//            } else {
//                // 这个景点第一次统计，存入“景点=1”
//                map.put(location, 1);
//            }
//            简化写法
            map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
        }

        // 5、把统计结果打印出来
        map.forEach((k, v) -> System.out.println(k + "被选择了" + v + "次"));
    }
}
