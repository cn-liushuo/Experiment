package com.java.loop;

public class ForTest3 {
    public static void main(String[] args) {
        // 奇数和
        System.out.println("1~10的奇数和是：" + sum(10));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
