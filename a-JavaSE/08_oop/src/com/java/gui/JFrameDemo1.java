package com.java.gui;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        // 快速入门 GUI Swing 的编程
        // 1、创建一个窗口，有一个输入框，有一个登录按钮
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel(); // 桌布面板，可以自动适应布局
        jf.add(panel); // 添加桌布面板到窗口中

        jf.setSize(400, 300); // 设置窗口大小
        jf.setLocationRelativeTo(null); // 设置窗口居中显示
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭窗口的默认操作：关闭窗口退出程序

        JButton jb = new JButton("登录"); // 创建一个按钮
        panel.add(jb); // 将按钮添加到桌布面板中
        jf.setVisible(true); // 设置窗口可见

    }
}
