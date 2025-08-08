package com.java.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 面向对象编程实现只能家具控制系统
        // 角色：设备（吊顶、电视机、洗衣机、落地窗......）
        // 具备的功能：开和关
        // 谁控制他们：智能控制系统（单例对象），控制调用设备的开和关。
        // 1、定义设备类：创建设备对象代表家里的设备。
        // 2、准备这些设备对象，放到数组中，代表整个家里的设备。
        HouseholdAppliances[] householdAppliances = new HouseholdAppliances[4];
        householdAppliances[0] = new TV("小米电视", true);
        householdAppliances[1] = new WashingMachine("美的洗衣机", false);
        householdAppliances[2] = new PendantLamp("吊灯", false);
        householdAppliances[3] = new AirConditioner("小米空调", false);

        // 3、为每个设备制定一个开和关的功能。定义一个接口，让家电实现开关功能。
        // 4、创建智能控制系统对象，控制设备的开和关
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        // 5、控制电视机。
        // smartHomeControl.control(householdAppliances[0]);

        // 6、提示用户操作，a、展示全部设备的当前情况。b、让用户选择哪一个操作。
        // 打印全部设备的开和关的现状。
        while (true) {
            smartHomeControl.printAllStatus(householdAppliances);
            System.out.println("请您选择要控制的设备：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "1":
                    smartHomeControl.control(householdAppliances[0]);
                    break;
                case "2":
                    smartHomeControl.control(householdAppliances[1]);
                    break;
                case "3":
                    smartHomeControl.control(householdAppliances[2]);
                    break;
                case "4":
                    smartHomeControl.control(householdAppliances[3]);
                    break;
                case "exit":
                    System.out.println("退出App");
                    return;
                default:
                    System.out.println("您输入的设备编号有误！");
            }
        }
    }
}
