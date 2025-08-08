package com.java.thisdemo;

public class Test {
    public static void main(String[] args) {
        // this
        Student s1 = new Student();
        s1.print();
        System.out.println(s1);

        System.out.println("==========");

        Student s2 = new Student();
        s2.print();
        System.out.println(s2);

        System.out.println("==========");

        Student s3 = new Student();
        s3.name = "汪苏泷";
        s3.printHobby("唱歌");
    }
}
