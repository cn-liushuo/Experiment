package com.java.demo3stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        // 掌握Stream流的统计，收集操作（终结方法）
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张三", 23, 5000.0));
        teachers.add(new Teacher("李四", 33, 6000.0));
        teachers.add(new Teacher("王五", 43, 7000.0));
        teachers.add(new Teacher("赵六", 53, 8000.0));
        teachers.add(new Teacher("孙七", 63, 9000.0));
        teachers.add(new Teacher("周八", 73, 10000.0));

        teachers.stream()
                .filter(t -> t.getSalary() > 5000)
                .forEach(System.out::println);

        System.out.println("------------------");

        long count = teachers.stream()
                .filter(t -> t.getSalary() > 5000)
                .count();
        System.out.println(count);

        System.out.println("------------------");

        // 获取薪水最高的老师对象
        Optional<Teacher> max = teachers.stream()
                .max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher maxTeacher = max.get(); // 获取Optional对象中的元素
        System.out.println(maxTeacher);

        System.out.println("------------------");

        // 获取薪水最低的老师对象
        Optional<Teacher> min = teachers.stream()
                .min((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher minTeacher = min.get(); // 获取Optional对象中的元素
        System.out.println(minTeacher);

        System.out.println("------------------");

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张翠山");

        // 流只能收集一次

        // 收集到集合或者数组中去
        Stream<String> s1 = list.stream()
                .filter(s -> s.startsWith("张"));
        // 收集到list集合
        List<String> list1 = s1.collect(Collectors.toList());
        System.out.println(list1);

//        Set<String>  set2 = new HashSet<>();
//        set2.addAll(list1);

        // 收集到set集合
        Stream<String> s2 = list.stream()
                .filter(s -> s.startsWith("张"));
        Set<String> set = s2.collect(Collectors.toSet());
        System.out.println(set);

        // 收集到数组中去
        Stream<String> s3 = list.stream()
                .filter(s -> s.startsWith("张"));
        Object[] array = s3.toArray();
        System.out.println("数组" + Arrays.toString(array));

        System.out.println("------------------");

        // 收集到map集合中去
        // 收集到map集合 键是老师名称 值是老师薪水
        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
//        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(t -> t.getName(), t -> t.getSalary()));
//        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(new Function<Teacher, String>() {
//            @Override
//            public String apply(Teacher teacher) {
//                return teacher.getName();
//            }
//        }, new Function<Teacher, Double>() {
//            @Override
//            public Double apply(Teacher teacher) {
//                return teacher.getSalary();
//            }
//        }));
        System.out.println(map);
    }
}
