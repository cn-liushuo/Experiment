package com.java.demo;

// 智能控制系统类。单例类。
public class SmartHomeControl {
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();

    private SmartHomeControl() {
    }

    public static SmartHomeControl getInstance() {
        return smartHomeControl;
    }

    public void control(HouseholdAppliances householdAppliances) {
        System.out.println("开始您的操作");
        System.out.println(householdAppliances.getName() + "状态目前是:" + (householdAppliances.isStatus() ? "开着" : "关闭"));
        householdAppliances.press(); // 按下开关
        System.out.println(householdAppliances.getName() + "状态已经是:" + (householdAppliances.isStatus() ? "开着" : "关闭"));
    }

    public void printAllStatus(HouseholdAppliances[] householdAppliances) {
        // 使用for循环，根据索引遍历每个设备。
        for (int i = 0; i < householdAppliances.length; i++) {
            HouseholdAppliances householdAppliance = householdAppliances[i];
            System.out.println((i + 1) + householdAppliance.getName() + "状态目前是:" + (householdAppliance.isStatus() ? "开着" : "关闭"));
        }
    }
}
