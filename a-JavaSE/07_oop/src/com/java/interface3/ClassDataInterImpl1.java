package com.java.interface3;

public class ClassDataInterImpl1 implements ClassDataInter {
    private Student[] students; // 记住送进来的全班对象信息

    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println("平均分：" + sum / students.length);
    }
}
