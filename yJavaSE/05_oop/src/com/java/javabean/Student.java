package com.java.javabean;

// 实体类
public class Student {
    // 1.私有成员变量
    private String name;
    private double chinese;
    private double math;

    // 必须提供无参数构造器
    public Student() {
    }

    // 提供一个有参数构造器(可选)
    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    // 2.提供公开的getter和setter的方法
    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
