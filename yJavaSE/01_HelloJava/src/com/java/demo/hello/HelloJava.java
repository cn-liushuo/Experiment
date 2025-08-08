package com.java.demo.hello;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("--------------------");
        printHelloJava();

        System.out.println("--------------------");
        System.out.println(sum(1, 2));
    }

    // 打印三行 Hello Java
    public static void printHelloJava() {
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
    }

    // 计算任意两个整数的和
    public static int sum(int a, int b) {
        return a + b;
    }
}
