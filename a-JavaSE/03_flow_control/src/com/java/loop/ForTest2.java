package com.java.loop;

public class ForTest2 {
    public static void main(String[] args) {
        System.out.println("1~5的和是：" + sum(5));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // sum = sum + i;
        }
        return sum;
    }
}
