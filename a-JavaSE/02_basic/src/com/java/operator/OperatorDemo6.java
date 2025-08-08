package com.java.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 逻辑运算符
        System.out.println(isMatch(100, 70, '女')); // true
        System.out.println(isMatch(180, 70, '男')); // false

        System.out.println(isMatch2(180, 10000));
        System.out.println(isMatch2(160, 1000000));
        System.out.println(isMatch2(160, 100));

        isMatch3(true);
        isMatch3(false);

        isMatch4();
        print();

    }

    // & 必须所有条件都为 true 则为 true，只要有一个是 false 则为 false
    public static boolean isMatch(int height, int weight, char sex) {
        boolean result = height > 170 & weight >= 60 & weight <= 80 & sex == '女';
        return result;
    }

    // | 只要有一个条件为 true 则为 true，所有条件都为 false 则为 false
    public static boolean isMatch2(int height, int income) {
        boolean result = height >= 180 | income > 300000;
        return result;
    }

    // ! 取反
    public static void isMatch3(boolean flag) {
        System.out.println(!flag);
    }

    // ^ 相同条件为 false，不同条件为 true
    public static void isMatch4() {
        System.out.println(false ^ false);
        System.out.println(true ^ true);
        System.out.println(true ^ false);
    }

    // && || 与 & | 区别
    public static void print() {
        int a = 100;
        int b = 2;
        System.out.println(a > 1000 && ++b > 1); // && 左边为 false 右边直接不执行
        System.out.println(b);
        System.out.println(a > 1000 & ++b > 1); // & 左边为 false 右边依旧执行
        System.out.println(b);

        int i = 10;
        int j = 20;
        System.out.println(i > 6 || ++j > 1);// || 左边为 true 右边直接不执行
        System.out.println(j);
        System.out.println(i > 11 | ++j > 1);// | 左边为 false 右边依旧执行
        System.out.println(j);
    }
}
