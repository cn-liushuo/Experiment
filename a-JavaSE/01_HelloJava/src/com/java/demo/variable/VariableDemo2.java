package com.java.demo.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目标：掌握8种基本数据类型定义变量
        printVariable();
    }

    public static void printVariable() {
        // 1.整型
        byte b = 10;
        // byte b1 = 128; // 越界了，报错
        short s = 20;
        int i = 30;
        long l1 = 234242342423L;

        // 2.浮点型
        float f = 1.1f;
        double d = 2.2;

        // 3.字符型
        char c = 'a';

        // 4.布尔型
        boolean flag = true;

        // 5.字符串型
        String str = "hello";
    }
}
