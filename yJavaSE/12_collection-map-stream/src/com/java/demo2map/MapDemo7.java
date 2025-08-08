package com.java.demo2map;

import com.java.demo1hashset.Teacher;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo7 {
    public static void main(String[] args) {
        // 目标：TreeMap集合（原理和用户与TreeSet一样）
        Map<Teacher, String> map = new TreeMap<>((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary())); // 按照键排序：升序
        map.put(new Teacher("老陈", 20, 6232.4), "462");
        map.put(new Teacher("老雷", 18, 3999.5), "422");
        map.put(new Teacher("老王", 22, 9999.9), "461");
        map.put(new Teacher("老李", 20, 1999.9), "423");
        System.out.println(map);
    }
}
