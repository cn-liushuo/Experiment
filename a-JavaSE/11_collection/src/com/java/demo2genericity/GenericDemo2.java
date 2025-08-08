package com.java.demo2genericity;

public class GenericDemo2 {
    public static void main(String[] args) {
        // 自定义泛型类
        // 需求：请您模拟ArrayList集合自定义一个集合MyArrayList
        MyArrayList<String> list = new MyArrayList<>(); // JDK 7开始支持的后面的类型可以省略
        list.add("java");
        list.add("java2");
//        list.add(2); // 报错
        list.add("前端");

        System.out.println(list.remove("java2"));

        System.out.println(list);
    }
}
