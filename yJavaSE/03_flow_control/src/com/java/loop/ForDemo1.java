package com.java.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        // for
        test1();
    }

    public static void test1() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }

        System.out.println("==========");

        for (int i = 0; i < 6; i++) {
            System.out.println("Hello World");
        }

        System.out.println("==========");

        for (int i = 0; i <= 9; i += 2) {
            System.out.println("Hello World");
        }
    }
}
