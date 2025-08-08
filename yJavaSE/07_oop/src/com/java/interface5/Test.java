package com.java.interface5;

// 4、一个类实现了多个接口，如果多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
interface A3 {
    default void show() {
        System.out.println("A3 show");
    }
}

interface B3 {
    default void show() {
        System.out.println("B3 show");
    }
}

// 3、一个类继承了父类，又同时实现了接口，如果父类中和接口中有同名的方法，实现类会优先用父类的[了解]。
interface A2 {
    default void show() {
        System.out.println("A2 show");
    }
}

// 2、一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承，也不支持多实现[了解]。
interface A1 {
    void show();
}

interface B1 {
    String show();
}

// 1、接口与接口可以多继承:一个接口可以同时继承多个接口[重点]。
// 类与类：单继承 一个类只能继承一个直接父类
// 类与接口：多实现，一个类可以同时实现多个接口。
// 接口与接口：多继承，一个接口可以同时继承多个接口。
interface A {
    void show1();
}

interface B {
    void show2();
}

interface C extends A, B {
    void show3();
}

public class Test {
    public static void main(String[] args) {
        // 理解接口的几点注意事项。
        Dog d = new Dog();
        d.show();
    }
}
// interface C1 extends A1,B1 {
// }
// class D1 implements C1 {
// }

class Dog2 implements A3, B3 {
    @Override
    public void show() {
        A3.super.show(); // A3接口的
        B3.super.show(); // B3接口的
    }
}

class Animal {
    public void show() {
        System.out.println("Animal show");
    }
}

class Dog extends Animal implements A2 {
    public void go() {
        show(); // 父类的
        super.show(); // 父类的
        A2.super.show(); // A2接口的
    }
}

class D implements C {

    @Override
    public void show3() {

    }

    @Override
    public void show1() {

    }

    @Override
    public void show2() {

    }
}
