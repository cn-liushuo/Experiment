package com.java.interface1;

public class Test {
    public static void main(String[] args) {
        // 认识接口，搞清楚接口的忒但，基本使用
        System.out.println(A.SCHOOL_NAME);
        // 注意：接口不能创建对象。
        // 接口是用来被类实现的。
        C c = new C();
        System.out.println(c.go());
        c.run();
        c.play();
    }
}

// C被称为实现类，同时实现了多个接口
// 实现类实现多个接口，必须重写完全部接口的全部抽象方法，否则这个类必须定义成抽象类。
class C implements A, B {

    @Override
    public void run() {
        System.out.println("go");
    }

    @Override
    public String go() {
        return "go";
    }

    @Override
    public void play() {
        System.out.println("play");
    }
}
