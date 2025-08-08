package com.java.demo1exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        // 自定义异常-运行时异常
        System.out.println("程序开始执行...");
        try {
            saveAge(300);
            System.out.println("成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败了");
        }
        System.out.println("程序结束执行...");
    }

    // 需求：我们公司的系统只要收到了年龄小于1岁或者大于200岁就是一个年龄非法异常
    public static void saveAge(int age) {
        if (age < 1 || age > 200) {
            // 年龄非法：抛出一个异常返回。
            throw new AgeIllegalRuntimeException("年龄非法 age 不能低于1岁不能高于200岁");
        } else {
            System.out.println("年龄合法");
            System.out.println("保存年龄：" + age);
        }
    }
}
