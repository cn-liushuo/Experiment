package com.java.innerclass2;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        // 静态内部类
        // 创建对象：外部类名称.内部类名称 对象名 = new 外部类名称.内部类名称();
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        // 1、静态内部类中是否可以直接访问外部类的静态成员？可以！
        // 2、
    }
}
