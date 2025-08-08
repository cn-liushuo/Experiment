package com.java.innerclass3;

interface Swim {
    void swimming(); // 游泳方法
}

public class Test2 {
    public static void main(String[] args) {
        // 匿名内部类（语法）
        // 需求：学生，老师都要参加游泳比赛
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生游泳");
            }
        };
        start(s1);

        System.out.println("====================");

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师游泳");
            }
        });
    }

    // 设计一个方法，可以接收老师，和学生开始比赛
    public static void start(Swim s) {
        System.out.println("开始");
        s.swimming();
        System.out.println("结束");
    }
}
