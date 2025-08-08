package com.java.innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        // 匿名内部类的使用场景
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
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录按钮被点击了");
            }
        });
        // btn.addActionListener(e -> System.out.println("登录按钮被点击了"));

        win.setVisible(true);
    }
}

