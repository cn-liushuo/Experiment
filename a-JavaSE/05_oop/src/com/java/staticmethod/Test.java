package com.java.staticmethod;

public class Test {
    public static void main(String[] args) {
        // 认识static修饰和修饰方法的区别
        // 1.类名.静态方法
        Student.printHelloWorld();

        System.out.println("=");

        // 2.对象.静态方法
        Student s1 = new Student();
        s1.printHelloWorld();

        // 3.对象名.实例方法
        // Student.printPass(); // 报错
        s1.setScore(59.5);
        s1.printPass();

        // 规范：如果这个方法只是为了做一个功能且不需要直接访问对象的数据，这个方法直接定义成静态方法。
        // 如果这个方法是对象的行为，需要访问对象的数据，这个方法必须定义成实例方法。

        System.out.println("=");
        // Test.printHelloWorld2();
        printHelloWorld2();
    }

    public static void printHelloWorld2() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}
