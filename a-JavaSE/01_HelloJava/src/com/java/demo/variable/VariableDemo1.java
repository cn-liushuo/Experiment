package com.java.demo.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        // 目标：认识变量
        printVariable();
    }

    public static void printVariable() {
        // 定义变量: 数据类型 变量名称 = 初始值;
        int age = 10;
        System.out.println(age);

        // 定义一个浮点型变量
        double score = 2.5;
        System.out.println(score);

        // 变量的数据是可以被替换的
        int age2 = 18;
        age2 = 19;
        System.out.println(age2);

        age2 = age2 + 1;
        System.out.println(age2);

        // 程序中可以直接写进制数据
        int i1 = 0b01100001; // 二进制 必须以0b开头
        System.out.println(i1);

        int i2 = 0141; // 八进制 必须以0开头
        System.out.println(i2);

        int i3 = 0xFA; // 十六进制 必须以0x开头
        System.out.println(i3);
    }
}
