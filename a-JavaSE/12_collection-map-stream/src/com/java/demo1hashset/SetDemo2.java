package com.java.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // HashSet 集合去重操作
        Student s1 = new Student("小明", 18, "北京", "123");
        Student s2 = new Student("小红", 18, "北京", "12345678901");
        Student s3 = new Student("小红", 18, "北京", "12345678901");
        Student s4 = new Student("小明", 18, "北京", "123");

        Set<Student> set = new HashSet<>(); // 不重复的！
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
