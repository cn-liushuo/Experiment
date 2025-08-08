package com.java.demo2recursion;

public class RecursionDemo2 {
    public static void main(String[] args) {
        // 计算n的阶乘
        int n = 5;
        System.out.println(n + "的阶乘：" + f(n));
        System.out.println("1-" + n + "的和：" + f2(n));
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n - 1) * n; // 递归调用
    }

    public static int f2(int n) {
        if (n == 1) {
            return 1;
        }
        return f2(n - 1) + n; // 递归调用
    }
}
