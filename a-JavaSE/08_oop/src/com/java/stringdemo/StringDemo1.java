package com.java.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        // 掌握创建字符串对象，封装要处理的字符串数据，调用string提供的方法处理字符串。
        // 1、推荐方式一：直接 "" 就可以创建字符串对象，封装字符串数据。
        String s1 = "hello";
        System.out.println(s1);
        System.out.println(s1.length()); // 处理字符串的方法

        // 2、方式二：通过构造器初始化对象。
        String s2 = new String(); // 不推荐
        System.out.println(s2); // "" 空字符串

        String s3 = new String("hello"); // 不推荐
        System.out.println(s3);

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {104, 101, 108, 108, 111};
        String s5 = new String(bytes);
        System.out.println(s5);

        System.out.println("------------------------------------------");

        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1 == t2);

        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3 == t4);

        System.out.println("------------------------------------------");

        // 调用字符串的方法，处理字符串的数据
        // 简易版的登录
        String okLoginName = "admin";
        System.out.println("请您输入您的登录名称：");
        Scanner sc = new Scanner(System.in);
        String loginName = sc.next();

        // 字符串对象的内容比较，千万不要用==，==默认比较地址，字符串对象的内容一样时地址不一定一样
        // 判断字符串内容，建议用 string 提供的 equals 方法，只关心内容一样，就返回 true，不关心地址。
        if (loginName.equals(okLoginName)) {
            System.out.println("恭喜您，登录成功");
        } else {
            System.out.println("很遗憾，登录失败");
        }

        System.out.println("------------------------------------------");

        // 15700001204 ==> 157****1204
        System.out.println("请您用手机号码登录：");
        String phone = sc.next();

        System.out.println("系统显示以下手机号码进入：");
        String newPhone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.println(newPhone);
    }
}
