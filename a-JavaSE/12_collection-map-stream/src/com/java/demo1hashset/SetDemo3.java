package com.java.demo1hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        // 搞清楚TreeSet集合对于自定义对象的排序
        Set<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
//                return o2.getAge() - o1.getAge(); // 降序
//                if (o1.getSalary() > o2.getSalary()) {
//                    return 1;
//                } else if (o2.getSalary() < o1.getSalary()) {
//                    return -1;
//                }
//                return 0;

//                return Double.compare(o1.getSalary(), o2.getSalary()); // 薪水升序
                return Double.compare(o2.getSalary(), o1.getSalary()); // 薪水降序
            }
        }); // 排序，不重复，无索引
//        简化形式
//        Set<Teacher> set = new TreeSet<>(((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())));
        set.add(new Teacher("老陈", 20, 5000));
        set.add(new Teacher("老王", 18, 4090.44));
        set.add(new Teacher("老李", 10, 6200.11));
        set.add(new Teacher("老赵", 24, 5000.34));
        System.out.println(set);

        // 结论：TreeSet集合默认不能给自定义对象排序，因为不知道大小规则。
        // 一定要解决怎么办？两种方案。
        // 1、对象类实现一个Comparable接口，重写compareTo方法，实现大小规则。
        // 2、public TreeSet (Comparator c) 集合自带比较器 Comparator对象，指定比较规则
    }
}
