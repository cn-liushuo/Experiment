package com.java.code;

public class CodeDemo2 {
    private String name;
    private String[] directrion = new String[4]; // 实例变量

    // 实例代码块：无 static 修饰，属于对象，每次创建对象时，都会优先执行一次。
    // 基本作用：初始化对象的实例资源
    {
        System.out.println("实例代码块");
        name = "DLDR"; // 赋值
        directrion[0] = "N";
        directrion[1] = "S";
        directrion[2] = "E";
        directrion[3] = "W";
    }

    public static void main(String[] args) {
        // 实例代码块
        System.out.println("main方法");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
