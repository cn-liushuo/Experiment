package com.java.demo7executorService;

import java.util.concurrent.Callable;

// 1.定义一个实现类Callable接口
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
            sum += i;
        }
        return Thread.currentThread().getName() + "计算1-" + n + "的和是：" + sum;
    }
}
