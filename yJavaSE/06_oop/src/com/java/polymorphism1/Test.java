package com.java.polymorphism1;

public class Test {
    public static void main(String[] args) {
        // 认识多态
        // 1.对象多态，行为多态。
        Animal a1 = new Wolf();
        a1.run(); // 方法：编译看左边，运行看右边
        System.out.println(a1); // 成员变量：编译看左边，运行也看左边

        Animal a2 = new Tortoise();
        a2.run(); // 方法：编译看左边，运行看右边
        System.out.println(a2); // 成员变量：编译看左边，运行也看左边
    }
}
