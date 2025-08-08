package com.java.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 三元运算符
        print(10, 40);
        print(59);
        System.out.println("较大值" + getMax(10, 20, 30));
    }

    public static void print(int a, int b) {
        int max = a > b ? a : b;
        System.out.println("较大值：" + max);
    }

    public static void print(int score) {
        String result = score > 60 ? "通过" : "挂科";
        System.out.println(result);
    }

    public static int getMax(int a, int b, int c) {
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        return max;
    }
}
