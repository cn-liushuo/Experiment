package com.java.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目标：掌握方法的定义和调用
        int sum = getSum(10, 20);
        System.out.println("sum = " + sum);

        print();
    }

    // 求任意两个整数的和并返回
    public static int getSum(int a, int b) {
        return a + b;
    }

    // 无返回值 无参数
    public static void print() {
        System.out.println("print");
    }
}
