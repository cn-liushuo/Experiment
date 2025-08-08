package com.java.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        inputScore();
    }

    public static void inputScore() {
        double[] scores = new double[8];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的数据:");
            scores[i] = sc.nextDouble();
        }

        double allScore = 0.0;
        double maxScore = scores[0];
        double minScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            allScore += score;

            if (score > maxScore) {
                maxScore = score;
            }

            if (score < minScore) {
                minScore = score;
            }
        }
        System.out.println("平均分" + allScore / scores.length);
        System.out.println("最高分" + maxScore);
        System.out.println("最低分" + minScore);
    }
}

