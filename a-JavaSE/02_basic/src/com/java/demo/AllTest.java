package com.java.demo;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        // 健康计算器
        Scanner sc = new Scanner(System.in);
        // 1.先让用户输入自己的个人信息：身高，体重，性别，年龄
        System.out.println("请输入您的身高（m）：");
        double height = sc.nextDouble();

        System.out.println("请输入您的体重（kg）：");
        double weight = sc.nextDouble();

        System.out.println("请输入您的性别（男/女）");
        String sex = sc.next();

        System.out.println("请输入您的年龄");
        int age = sc.nextInt();

        double bmi = calcBMI(height, weight);
        System.out.println("您的BMI值是：" + bmi);

        // 判断用户的 bmi 值的情况 ...

        double bmr = calcBMR(height, weight, sex, age);
        System.out.println("您的BMR值是：" + bmr);

    }

    // 2.根据个人信息，计算BMI指数（把数据交给一个独立的方法来计算并返回这个结果）
    public static double calcBMI(double height, double weight) {
        return weight / (height * height);
    }

    // 3.根据个人信息，计算BMR指数（把数据交给一个独立的方法来计算并返回这个结果）
    public static double calcBMR(double height, double weight, String sex, int age) {
        double bmr = 0;
        if ("男".equals(sex)) {
            bmr = 10 * weight + 6.25 * height - 5 * age + 5;
        } else {
            bmr = 10 * weight + 6.25 * height - 5 * age - 161;
        }
        return bmr;
    }
}
