package com.java.javabean;

public class Test {
    public static void main(String[] args) {
        // 实体类
        // 作用：创建它的对象，存取数据（封装数据）
        Student s = new Student();
        s.setName("瑞");
        s.setChinese(100);
        s.setMath(100);
        System.out.println(s.getName());
        System.out.println(s.getChinese());
        System.out.println(s.getMath());

        Student s2 = new Student("铄", 50, 80);
        System.out.println(s2.getName());
        System.out.println(s2.getMath());
        System.out.println(s2.getChinese());

        // 实体类在开发中的应用场景
        // 创建一个学生的操作对象专门负责对学生对象的数据进行业务处理。
        StudentOperator operator = new StudentOperator(s2);
        operator.printTotalScore();
        operator.printAverageScore();
    }
}
