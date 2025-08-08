package com.java.branch;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        // switch
        test1();
    }

    public static void test1() {
        System.out.println("请输入您的性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();

        switch (sex) {
            case "男":
                System.out.println("Java");
                break;
            case "女":
                System.out.println("Word");
                break;
            default:
                System.out.println("Other");
        }
    }
}
