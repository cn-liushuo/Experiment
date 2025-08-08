package com.java.code;

import java.util.Arrays;

public class CodeDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];

    // 静态代码块：有 static 修饰，属于类，与类一起优先加载，自动执行一次
    // 基本作用：可以完成对类的静态资源的初始化
    static {
        System.out.println("静态代码块");
        schoolName = "DLDR";
        cards[0] = "A";
        cards[1] = "2";
        cards[2] = "3";
        // ...
    }

    public static void main(String[] args) {
        // 代码块
        System.out.println("main方法");
        System.out.println(Arrays.toString(cards)); // 返回数组的内容观察
    }
}
