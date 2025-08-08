package com.java.extends2modifier;

public class Test {
    // 四种权限修饰符的范围
    public static void main(String[] args) {
        Fu fu = new Fu();
        // fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
