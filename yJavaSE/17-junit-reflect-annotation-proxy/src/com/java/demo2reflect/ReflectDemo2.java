package com.java.demo2reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    @Test
    public void getClassInfo() {
        // 获取类的信息。
        // 1.反射第一步：获取Class对象，代表拿到类。
        Class c1 = Student.class;
        System.out.println(c1.getName()); // 类名的全类名
        System.out.println(c1.getSimpleName()); // 类名
    }

    @Test
    public void getConstructorInfo() throws Exception {
        // 获取类的构造器并对其进行操作
        // 1.反射第一步：获取Class对象，代表拿到类
        Class c1 = Dog.class;
        // 2.获取构造器对象
        Constructor[] cons = c1.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName() + "(" + con.getParameterCount() + ")");
        }
        // 3.获取单个构造器
        Constructor con = c1.getDeclaredConstructor(); // 无参构造器
        System.out.println(con.getName() + "(" + con.getParameterCount() + ")");

        Constructor con2 = c1.getDeclaredConstructor(String.class, int.class); // 2个参数的有参构造器
        System.out.println(con2.getName() + "(" + con2.getParameterCount() + ")");

        // 4.获取构造器的依然是创建对象：创建对象。
        // 暴力反射：暴力反射可以访问私有的构造器、方法、属性
        con.setAccessible(true); // 绕过访问权限，直接访问！
        Dog d1 = (Dog) con.newInstance();
        System.out.println(d1);

        Dog d2 = (Dog) con2.newInstance("小黑", 3);
        System.out.println(d2);
    }

    // 3.获取类的成员变量对象并对其进行操作。
    @Test
    public void getFieldInfo() throws Exception {
        // 目标：获取类的成员变量并对其进行操作。
        // 1.反射第一步：获取Class对象，代表拿到类
        Class c1 = Dog.class;
        // 2.获取成员变量对象
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "(" + field.getType().getName() + ")");
        }
        // 3.获取单个成员变量对象
        Field field = c1.getDeclaredField("hobby");
        System.out.println(field.getName() + "(" + field.getType().getName() + ")");

        Field field1 = c1.getDeclaredField("age");
        System.out.println(field1.getName() + "(" + field1.getType().getName() + ")");

        // 4.获取成员变量的目的依然是取值和赋值
        Dog d = new Dog("泰迪", 3);
        field.setAccessible(true); // 绕过访问权限，直接访问！

        field.set(d, "社交");
        System.out.println(d);

        String hobby = (String) field.get(d); // d.getHobby()
        System.out.println(hobby);
    }

    // 4.获取类的成员方法对象并对其进行操作。
    @Test
    public void getMethodInfo() throws Exception {
        // 目标：获取类的成员方法对象并对其进行操作
        // 1.反射第一步，获取Class对象，代表拿到类
        Class c1 = Dog.class;
        // 2.获取成员方法对象
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        }
        // 3.获取单个成员方法对象
        Method eat = c1.getDeclaredMethod("eat"); // 获取的是无参数的eat方法
        Method eat1 = c1.getDeclaredMethod("eat", String.class); // 获取的是有参数的eat方法

        System.out.println(eat.getName() + "(" + eat.getParameterCount() + ")");
        System.out.println(eat1.getName() + "(" + eat1.getParameterCount() + ")");

        // 4.获取成员方法的目的依然是是调用方法。
        Dog d = new Dog("泰迪", 3);
        eat.setAccessible(true); // 绕过访问权限，直接访问！
        Object re = eat.invoke(d);// 唤醒对象d的eat方法执行，相当于d.eat();
        System.out.println(re); // null

        Object rs1 = eat1.invoke(d, "牛肉"); // 唤醒对象d的eat带String参数的方法执行，相当于d.eat("牛肉");
        System.out.println(rs1);
    }
}
