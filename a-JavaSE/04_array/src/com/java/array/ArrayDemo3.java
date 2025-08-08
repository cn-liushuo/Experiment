package com.java.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 求最大值
        int[] scores = {15, 9000, 10000, 20000, 9500, -5};
        int max = getMax(scores);
        System.out.println("最大值是" + max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            if (data > max) {
                max = data;
            }
        }
        return max;
    }
}
