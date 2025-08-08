package com.java.interface4;

public interface A {
    // 3、静态方法
    // 默认public修饰
    // 如何调用？只能使用当前接口名来调用
    static void show() {
        System.out.println("show");
    }

    // 2、私有方法（JKD9开始支持）
    // 私有的实例方法。
    // 如何调用？使用接口中的其他实例方法来调用它
    // private void run() {
    //     System.out.println("A.run");
    // }

    // 1、默认方法（普通实例方法）：必须加 default 修饰
    // 默认会加public修饰
    // 如何调用？ 使用接口的实现类的对象来调用。
    default void go() {
        System.out.println("A.go");
        // run();
    }
}
