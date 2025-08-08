package com.java.extends4feature;

public class Test {
    public static void main(String[] args) {
        // 继承的特点
        A a = new A();

    }
}

// 1.java的类只能是单继承的，不支持多继承，支持多层继承
// 2.一个类要么直接继承Object，要么默认继承Object，要么间接继承Object
class A extends Object {
}

class B extends A {
}

class C extends B {
}
