package com.java.loop;

public class BreakAndContinueDemo9 {
    public static void main(String[] args) {
        // break continue
        test();
        test2();
    }

    public static void test() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // 跳出并结束循环
            }
            System.out.println(i);
        }
    }

    public static void test2() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
