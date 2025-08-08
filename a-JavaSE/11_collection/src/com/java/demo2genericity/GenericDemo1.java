package com.java.demo2genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        // 泛型
        ArrayList<String> list = new ArrayList();
        list.add("hello");
        list.add("world");
//        list.add(100);
//        list.add(true);
//        list.add('a');
//        list.add(new Object());

        // 获取数据
        for (int i = 0; i < list.size(); i++) {
//            Object rs = list.get(i);
//            // 把数据转型处理。
//            String s = (String) rs;
//            System.out.println(s);
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
