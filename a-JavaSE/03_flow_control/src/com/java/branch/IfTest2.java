package com.java.branch;

public class IfTest2 {
    public static void main(String[] args) {

    }

    public static void test1() {
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        if (red) {
            System.out.println("红灯停");
        } else if (yellow) {
            System.out.println("黄灯慢");
        } else if (green) {
            System.out.println("绿灯行");
        } else {
            System.out.println("灯故障");
        }
    }
}
