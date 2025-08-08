package com.java.loop;

public class WhileTest5 {
    public static void main(String[] args) {
        System.out.println("需要多少年：" + calc());
        System.out.println("需要折叠多少次：" + calc2());
    }

    public static int calc() {
        double money = 100000;
        double rate = 0.017;
        int year = 0;

        while (money < 200000) {
            year++;
            money = money * (1 + rate);
        }
        return year;
    }

    public static int calc2() {
        double height = 8848860;
        double thickness = 0.1;
        int count = 0;
        while (thickness < height) {
            count++;
            thickness *= 2;
        }
        return count;
    }
}
