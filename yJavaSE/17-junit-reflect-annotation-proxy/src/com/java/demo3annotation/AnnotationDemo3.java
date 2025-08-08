package com.java.demo3annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo3 {
    // 解析注解
    @Test
    public void parseClass() throws Exception {
        // 1.获取对象
        Class c1 = Demo.class;
        // 2.使用isAnnotationPresent判断这个类上是否陈列了注解@MyTest2
        if (c1.isAnnotationPresent(MyTest2.class)) {
            // 3.获取注解对象
            MyTest2 myTest2 = (MyTest2) c1.getAnnotation(MyTest2.class);

            // 4.获取注解属性值
            String[] address = myTest2.address();
            double height = myTest2.height();
            String value = myTest2.value();

            // 5.打印注解属性值
            System.out.println(Arrays.toString(address));
            System.out.println(height);
            System.out.println(value);
        }
    }

    @Test
    public void parseMethod() throws Exception {
        // 1.获取对象
        Class c1 = Demo.class;
        // 2.获取方法对象
        Method go = c1.getDeclaredMethod("go");
        // 3.使用isAnnotationPresent判断这个方法上是否陈列了注解@MyTest2
        if (go.isAnnotationPresent(MyTest2.class)) {
            // 4.获取注解对象
            MyTest2 myTest2 = go.getDeclaredAnnotation(MyTest2.class);
            // 5.获取注解属性值
            String[] address = myTest2.address();
            double height = myTest2.height();
            String value = myTest2.value();

            // 6.打印注解属性值
            System.out.println(Arrays.toString(address));
            System.out.println(height);
            System.out.println(value);
        }
    }
}
