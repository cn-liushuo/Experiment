package com.java.demo5_synchronized_method;

// 取钱线程类
public class DrawThread extends Thread {
    private Account account; // 记住线程要处理的账户对象

    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        // 取钱
        account.drawMoney(100000);
    }
}
