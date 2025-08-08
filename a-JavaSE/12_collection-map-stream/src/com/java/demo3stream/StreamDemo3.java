package com.java.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        // 掌握stream流提供的常用的中级方法，对流上的数据进行处理（返回新流，支持链式编程）
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");

        // 1、过滤方法
        list.stream()
                .filter(s -> s.startsWith("张") && s.length() == 3)
                .forEach(System.out::println);

        // 2、排序方法
        List<Double> scores = new ArrayList<>();
        scores.add(99.5);
        scores.add(88.5);
        scores.add(88.5);
        scores.add(77.5);
        scores.add(77.5);
        scores.add(66.5);
        scores.add(55.5);

        scores.stream()
                .sorted()
                .forEach(System.out::println); // 默认是升序
        System.out.println("------------------");
        scores.stream()
                .sorted((s1, s2) -> Double.compare(s2, s1))
                .limit(2) // 只要前两名
                .forEach(System.out::println); // 降序
        System.out.println("------------------");
        scores.stream()
                .sorted((s1, s2) -> Double.compare(s2, s1))
                .skip(2) // 跳过前两名
                .forEach(System.out::println);
        System.out.println("------------------");
        // 如果希望自定义对象能够去重复，重写对象的hashcode和equals方法
        scores.stream()
                .sorted((s1, s2) -> Double.compare(s2, s1))
                .distinct() // 去重
                .forEach(System.out::println);

        System.out.println("----------------");

        // 映射方法：加工方法，把流上原来的数据拿出来变成新数据又放到流上去。
        scores.stream()
                .map(s -> "加10分后：" + (s + 10))
                .forEach(System.out::println);

        System.out.println("----------------");

        // 合并流
        Stream<String> s1 = Stream.of("张三", "李四", "王五");
        Stream<Integer> s2 = Stream.of(111, 22, 33);

        Stream<Object> s3 = Stream.concat(s1, s2);

        System.out.println(s3.count());
    }
}
