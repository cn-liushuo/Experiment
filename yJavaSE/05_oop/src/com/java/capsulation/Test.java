package com.java.capsulation;

public class Test {
    public static void main(String[] args) {
        // 封装：合理隐藏 合理暴露
        Student s1 = new Student();
        s1.setAge(19); // 赋值
        System.out.println(s1.getAge());
    }
}
