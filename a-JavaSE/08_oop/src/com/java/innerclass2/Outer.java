package com.java.innerclass2;

// 外部类
public class Outer {
    public static String schoolName = "DLDR";
    private int age; // 实例成员

    // 静态内部类：属于外部类本身持有
    public static class Inner {
        private String name;

        public void show() {
            System.out.println(schoolName);
            // 静态内部类是否可以直接访问外部类的实例成员？不可以！
            // System.out.println(age); // 报错！
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
