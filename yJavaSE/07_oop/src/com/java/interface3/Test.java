package com.java.interface3;

public class Test {
    public static void main(String[] args) {
        // 完成接口小案例
        // 1、定义学生类，创建学生对象，封装学生数据，才能交给别人处理。
        // 2、准备学生数据，目前我们自己造一些测试数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 100);
        allStudents[1] = new Student("李四", '男', 99);
        allStudents[2] = new Student("王五", '女', 98);
        allStudents[3] = new Student("赵六", '女', 97);
        allStudents[4] = new Student("孙七", '男', 96);
        allStudents[5] = new Student("周八", '女', 95);
        allStudents[6] = new Student("吴九", '男', 94);
        allStudents[7] = new Student("郑十", '女', 93);
        allStudents[8] = new Student("王十一", '男', 92);
        allStudents[9] = new Student("赵十二", '女', 91);

        // 3、提供两套业务实现方案，支持灵活切换（解耦合）：面向接口编程。
        //      -- 定义一个接口（规范思想）：必须完成打印全安学生信息，打印平均分
        //      -- 定义第一套实现类，实现接口：实现打印学生信息，实现打印平均分
        //      -- 定义第二套实现类，实现接口：实现打印学生（男女人数），实现打印平均分（去掉最高分和最低分）。
        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
