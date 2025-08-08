package com.java.extends2modifier;

public class Fu {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }

    // 1.private 只能当前类中访问
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    // 2.缺省，只能当前类中，同一个包下的其他类中
    void method() {
        System.out.println("method");
    }

    // 3.protected 只能当前类中，同一个包下的其他类中，子孙类中访问
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    // public 任何类中都可以访问
    public void publicMethod() {
        System.out.println("publicMethod");
    }
}
