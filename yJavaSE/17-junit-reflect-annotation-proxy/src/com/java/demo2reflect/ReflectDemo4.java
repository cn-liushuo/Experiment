package com.java.demo2reflect;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        // 搞清楚反射的应用：做框架的通用技术
        Dog dog = new Dog("旺财", 3);
        SaveObjectFrameWork.saveObject(dog);

        // 创建学生对象
        Student stu = new Student("小铄", 18, "软件工程");
        SaveObjectFrameWork.saveObject(stu);

        // 创建老师对象
        Teacher tea = new Teacher("小瑞", 19, "Java", 6000, "软件工程", '女', "12345678901");
        SaveObjectFrameWork.saveObject(tea);
    }
}
