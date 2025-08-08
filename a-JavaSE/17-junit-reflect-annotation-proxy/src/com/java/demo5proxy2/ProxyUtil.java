package com.java.demo5proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static <T> T createProxy(T userService) {
        T proxy = (T) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis(); // 记录结束时间 1970年1月1日0时0分0秒0毫秒 走到此刻的总毫秒
                // 真正调用业务对象被代理的方法
                Object result = method.invoke(userService, args);

                long end = System.currentTimeMillis();
                System.out.println(method.getName() + "耗时：" + (end - start) / 1000.0 + "秒");
                return result;
            }
        });
        return proxy;
    }
}
