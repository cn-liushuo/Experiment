package com.java.lambda;

import com.java.innerclass3.Student;

import javax.swing.*;
import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 用Lambda表达式简化实际示例
        test1();
        test2();
    }

    public static void test1() {
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 32, 171.5, '女');
        students[1] = new Student("杨幂", 28, 168.5, '女');
        students[2] = new Student("赵丽颖", 30, 165.5, '女');
        students[3] = new Student("李易峰", 35, 175.5, '男');
        students[4] = new Student("周杰伦", 37, 180.5, '男');
        students[5] = new Student("刘德华", 41, 180.5, '男');

        // 需求：按照年龄升序排序。可以调用sun公司写好的API直接对数组进行排序。
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge(); // 按照年龄升序！
//            }
//        });

//        Arrays.sort(students, (Student o1, Student o2) -> {
//            return o1.getAge() - o2.getAge(); // 按照年龄升序！
//        });

//        Arrays.sort(students, ( o1,  o2) -> {
//            return o1.getAge() - o2.getAge(); // 按照年龄升序！
//        });

        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        // 遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }

    public static void test2() {
        // 需求：创建一个登录窗口，窗口上只有一个登录按钮
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 200);
        win.setLocationRelativeTo(null); // 居中显示
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭窗口的默认操作

        JPanel panel = new JPanel(); // 桌布面板，可以自动适应布局
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        // java要求必须给这个按钮添加一个点击事件监听器都西昂，这样就可以监听用户的点击操作，就可以做出 反应。
        // 开发中不是我们要主动去写匿名内部类，而是用别人的功能的时候，别人可以让我们洗一个匿名内部类，我们才会写！
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("登录按钮被点击了");
//            }
//        });

//        btn.addActionListener((ActionEvent e) -> {
//            System.out.println("登录按钮被点击了");
//        });

//        btn.addActionListener(e -> {
//            System.out.println("登录按钮被点击了");
//        });

        btn.addActionListener(e -> System.out.println("登录按钮被点击了"));


        win.setVisible(true);
    }
}
