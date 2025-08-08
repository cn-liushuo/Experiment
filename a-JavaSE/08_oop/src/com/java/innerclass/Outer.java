package com.java.innerclass;

// 外部类
public class Outer {
    public static String schoolName = "DLDR";
    private int age;

    ;

    public static void test() {
        System.out.println("test方法");
    }

    public void run() {
        System.out.println("run方法");
    }

    ;

    // 成员内部类：无 static 修饰，属于外部类的对象持有的。
    public class Inner {
        private String name;

        public Inner() {
            System.out.println("Inner()" + name);
        }

        public Inner(String name) {
            this.name = name;
            System.out.println("Inner()");
        }

        public void show() {
            System.out.println("show方法");
            // 成员内部类中可以直接访问外部类的静态成员
            System.out.println(schoolName);
            test();
            // 也可以直接访问外部类的实例成员
            System.out.println(age);
            run();
            System.out.println(this); // 自己的对象
            System.out.println(Outer.this); // 寄生的外部类对象
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
