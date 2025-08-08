package com.java.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // Collection集合的整体特点
        // 1、List家族的集合：有序、可重复、有索引。
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("c");
        list.add("c++");
        System.out.println(list); // [java, java, c, c++] 顺序和添加的顺序一致。
        String rs = list.get(0);
        System.out.println(rs);

        // 2、Set家族的集合：无序、不可重复、无索引。
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("c");
        set.add("c++");
        System.out.println(set);
    }
}
