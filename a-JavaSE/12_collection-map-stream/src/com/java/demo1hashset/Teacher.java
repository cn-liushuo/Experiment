package com.java.demo1hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 1、对象类实现一个Comparable接口，重写compareTo方法，实现大小规则。
public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }

    // t2.compareTo(t1)
    // t2 == this 比较者
    // t1 == o 被比较者
    // 规定1：如果你认为左边对象 大于 右边对象 那么返回正整数。
    // 规定2：如果你认为左边对象 小于 右边对象 那么返回负整数。
    // 规定3：如果认为相等，那么返回0
    @Override
    public int compareTo(Teacher o) {
        // 按照年龄升序
//        if(this.getAge() > o.getAge()) return 1;
//        if(this.getAge() < o.getAge()) return -1;
//        return 0;
        return this.getAge() - o.getAge(); // 升序
//        return o.getAge() - this.getAge(); // 降序
    }
}
