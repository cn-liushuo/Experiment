package com.java.lambda;

// 函数式接口：只有一个抽象方法的接口
@FunctionalInterface // 声明函数时接口的注解。
interface Swim {
    void swim();
}

public class LambdaDemo1 {
    public static void main(String[] args) {
        // lambda表达式
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("Animal cry");
            }
        };
        a.cry();

        // 错误示范：Lambda并不是可以简化全部的匿名内部类，Lambda表达式只能简化函数式接口的匿名内部类。
//        Animal a1 = new Animal() -> {
//                System.out.println("Animal cry");
//        };
//        a1.cry();

        System.out.println("================");

//        Swim s1 = new Swim() {
//            @Override
//            public void swim() {
//                System.out.println("学生游泳");
//            }
//        };

        // Lambda 只能简化函数式接口的匿名内部类。
        Swim s1 = () -> {
            System.out.println("学生游泳");
        };
        s1.swim();
    }
}

abstract class Animal {
    public abstract void cry();
}