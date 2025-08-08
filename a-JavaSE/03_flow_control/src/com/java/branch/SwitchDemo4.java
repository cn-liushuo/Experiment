package com.java.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        // switch穿透性的应用
        test1();
        test3();
    }

    //    1、表达式类型只能是byte、short、int、char，JDK5开始文持枚举，JDK7升始文持String、不支持double.float、long。
    public static void test1() {
        System.out.println(0.1 + 0.2);
//        double a = 10.5;
//        switch (a) {
//            case 10.5:
//                System.out.println("10.5");
//                break;
//            case 10.8:
//                System.out.println("10.8");
//                break;
//            default:
//                System.out.println("default");
//        }
    }

    // 2、case给出的值不允许重复、且只能是字面量，不能是变量。
    public static void test2() {
        int a = 10;
        int b = 15;
        switch (a) {
            case 10:
                System.out.println("10");
                break;
            case 15:
                System.out.println("15");
                break;
            default:
                System.out.println("default");
        }
    }

    // 3、正常使用switch的时候，不要忘记写break，否则会出现穿透现象。
    // 穿透性的作用：相同程序的case块，可以通过穿透性进行合并，从而减少重复代码的书写。
    public static void test3() {
        String week = "周二";
        switch (week) {
            case "周一":
                System.out.println("埋头苦干，解决Bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("日期有误");
        }
    }
}
