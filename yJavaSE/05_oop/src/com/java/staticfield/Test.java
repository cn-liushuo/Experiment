package com.java.staticfield;

public class Test {
    public static void main(String[] args) {
        // state 修饰成员变量，特点，访问机制，搞清楚作用
        // 1.类名.静态变量（推荐）
        Student.name = "张三";
        System.out.println(Student.name);

        // 2.对象名.静态变量（不推荐）
        Student s = new Student();
        s.name = "李四";

        Student s1 = new Student();
        s.name = "秋雅";

        System.out.println(s1.name);
        System.out.println(Student.name);

        // 3.对象名.实例变量
        s.age = 20;
        s1.age = 22;
        System.out.println(s.age);
        System.out.println(s1.age);
    }
}
