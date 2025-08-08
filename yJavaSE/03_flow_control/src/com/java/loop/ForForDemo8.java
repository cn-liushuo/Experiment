package com.java.loop;

public class ForForDemo8 {
    public static void main(String[] args) {
        // 循环嵌套
        test();
        print99();
    }

    public static void test() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*"); // 不换行打印
            }
            System.out.println(); // 换行打印
        }
    }

    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
