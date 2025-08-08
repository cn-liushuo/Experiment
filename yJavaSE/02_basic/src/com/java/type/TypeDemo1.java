package com.java.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 目标：认识自动类型转换，强制类型转换。
        byte a = 12;
        print(a); // 自动类型转换

        print2(a); // 自动类型转换

        int i = 20;
        // print3(i); // 类型范围大的变量是不能直接赋值给类型范围小的变量，会报错！！！

        // 强制类型转换
        print3((byte) i);

        int m = 1500;
        print3((byte) m); // 出现数据溢出！！

        double d = 3.14;
        int l = (int) d; // 浮点型转整数，直接去掉小数部分
        System.out.println(l);
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print2(double d) {
        System.out.println(d);
    }

    public static void print3(byte b) {
        System.out.println(b);
    }
}
