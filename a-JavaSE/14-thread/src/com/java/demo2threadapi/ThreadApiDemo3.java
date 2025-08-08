package com.java.demo2threadapi;

public class ThreadApiDemo3 {
    public static void main(String[] args) {
        // 目标：搞清楚线程的join方法：线程插队，让调用这个方法的线程先执行完毕
        MyThread2 t1 = new MyThread2();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "线程输出" + i);
            if (i == 1) {
                try {
                    t1.join(); // 插队 让t1线程执行完毕，然后继续执行主线程
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread2 extends Thread {
    // 2.重写Thread类的run方法

    @Override
    public void run() {
        // 3.再run方法中编写线程的任务代码（线程要干的活）
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程输出：" + i);
        }
    }
}