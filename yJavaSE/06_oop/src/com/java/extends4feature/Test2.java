package com.java.extends4feature;

public class Test2 {
    public static void main(String[] args) {
        // 继承后子类访问特点：就近原则。
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu {
    String name = "fu的name";

    public void run() {
        System.out.println("fu类的run方法");
    }
}

class Zi extends Fu {
    String name = "zi的name";

    public void show() {
        String name = "show的name";
        System.out.println(name); // show的name
        System.out.println(this.name); // zi的name
        System.out.println(super.name); // fu的name

        run(); // zi类的run方法
        super.run(); // fu类的run方法
    }

    public void run() {
        System.out.println("zi类的run方法");
    }
}
