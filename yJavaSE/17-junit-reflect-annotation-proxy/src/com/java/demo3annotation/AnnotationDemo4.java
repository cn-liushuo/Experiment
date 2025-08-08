package com.java.demo3annotation;

import java.lang.reflect.Method;

public class AnnotationDemo4 {
    // 注解的应用场景：模拟 junit 框架。有MyTest注解的方法就执行，没有的就不执行
    public static void main(String[] args) throws Exception {
        AnnotationDemo4 ad = new AnnotationDemo4();
        // 1.获取类对象
        Class c = AnnotationDemo4.class;
        // 2.获取所有方法
        Method[] methods = c.getMethods();
        // 3.遍历所有方法，判断方法上是否有MyTest注解，有，就执行方法，没有，就不执行方法
        for (Method method : methods) {
            // 4.判断方法上是否有MyTest注解
            if (method.isAnnotationPresent(MyTest.class)) {
                // 获取到这个方法的注解
                MyTest myTest = method.getDeclaredAnnotation(MyTest.class);
                int count = myTest.count();
                // 5.有就执行这个method方法
                for (int i = 0; i < count; i++) {
                    method.invoke(ad);
                }
            }
        }
    }

    // 测试方法：public 无参  无返回值
    @MyTest
    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }

    @MyTest(count = 5)
    public void test3() {
        System.out.println("test3");
    }

    @MyTest
    public void test4() {
        System.out.println("test4");
    }
}
