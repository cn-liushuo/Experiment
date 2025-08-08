package com.java.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        // 目标：掌握在没有返回值的函数中单独使用 return; 提前结束方法
        div(10, 0);
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("除数b不能为0");
            return; // 提前结束方法 卫语言风格
        }
        System.out.println(a / b);
    }
}
