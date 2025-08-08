package com.java.method1reference;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        // 实例方法引用，演示一个场景
        test();
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
        Student t = new Student();
//        Arrays.sort(students, (o1, o2) -> t.compareByHeight(o1,o2));

        // 实例方法引用
        // 前提： -> 前后参数的形式一致，才可以使用实例方法引用
        Arrays.sort(students, t::compareByHeight);

        // 遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
