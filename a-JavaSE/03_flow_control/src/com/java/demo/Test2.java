package com.java.demo;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        // Math.random() 返回 [0,1)之间的随机小数
        // (int) (Math.random() * 100) ==> [0,100)的参数 => [0,99] + 1 => [1,100]
        // int num = (int) (Math.random() * 100) + 1;

        Random r = new Random(); // 得到一个随机数对象
        int luckNumber = r.nextInt(100) + 1; // [0,99] + 1 => [1,100]

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入猜测的数字：");
            int guessNumber = sc.nextInt();

            if (guessNumber == luckNumber) {
                System.out.println("恭喜你，答对啦");
                break;
            } else if (guessNumber > luckNumber) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
    }
}
