package com.java.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：认识方法重载
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(double d, int a) {
        System.out.println(d);
    }

    public static void print(int a, double d) {
        System.out.println(d);
    }

    // 注意：方法重载只关心方法名相同，形参列表不同（类型不同，个数不同，顺序不同），其他都无所谓
}
