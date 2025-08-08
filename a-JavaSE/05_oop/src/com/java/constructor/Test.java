package com.java.constructor;

public class Test {
    public static void main(String[] args) {
        // 构造器
        // 构造器的特点：创建对象时，对象会立即自动创建构造器
        Student s1 = new Student();
        Student s2 = new Student("西门吹雪");

        System.out.println("==========");
        Student t1 = new Student();
        t1.name = "石轩";
        t1.age = 22;
        t1.sex = '男';
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.sex);

        Student t2 = new Student("瑞", 18, '女');
        System.out.println(t2.name);
        System.out.println(t2.age);
        System.out.println(t2.sex);
    }
}
