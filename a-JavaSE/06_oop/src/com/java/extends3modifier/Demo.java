package com.java.extends3modifier;

import com.java.extends2modifier.Fu;

public class Demo {
    public static void main(String[] args) {
        Fu fu = new Fu();
        // fu.privateMethod();
        // fu.method();
        // fu.protectedMethod();
        fu.publicMethod();
    }
}
