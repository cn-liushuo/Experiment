package com.java.loop;

public class DeadForDemo7 {
    public static void main(String[] args) {
        // 死循环
        test();
    }

    public static void test() {
//        for (;;) {
//            System.out.println("Hello World");
//        }

//        while (true) {
//            System.out.println("Hello World");
//        }

        do {
            System.out.println("Hello World");
        } while (true);
    }
}
