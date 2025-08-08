package com.java.method1reference;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        // 静态方法引用，演示一个场景
    }

    public static void test() {
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 32, 171.5, '女');
        students[1] = new Student("杨幂", 28, 168.5, '女');
        students[2] = new Student("赵丽颖", 30, 165.5, '女');
        students[3] = new Student("李易峰", 35, 175.5, '男');
        students[4] = new Student("周杰伦", 37, 180.5, '男');
        students[5] = new Student("刘德华", 41, 180.5, '男');

        // 需求：按照年龄升序排序。可以调用sun公司写好的API直接对数组进行排序。
//        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

//        Arrays.sort(students, (o1, o2) -> Student.compareByAge(o1, o2));

        // 静态方法引用： 类名::静态方法
        Arrays.sort(students, Student::compareByAge);

        // 遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}

