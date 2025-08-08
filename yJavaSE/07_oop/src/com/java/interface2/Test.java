package com.java.interface2;

interface Driver {
}

interface BoyFriend {
}

public class Test {
    public static void main(String[] args) {
        // 理解 java 设计接口的好处、用处
        // 接口弥补了类继承的不足，可以让类拥有更多角色，类的功能更强大。
        People p = new People();
        Driver d = new Student(); // 多态
        BoyFriend bf = new Student();

        // 接口可以实现面向接口编程，更利于解耦合。
        Driver a = new Teacher();
        BoyFriend b = new Teacher();
    }
}

class People {
}

class Student extends People implements Driver, BoyFriend {
}

class Teacher implements Driver, BoyFriend {
}