package com.java.demo1create;

public class ThreadDemo2_2 {
    public static void main(String[] args) {
        // 掌握多线程的创建方式二：实现Runnable接口的匿名内部类来创建
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程输出" + i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线2程输出：" + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线3程输出：" + i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}
