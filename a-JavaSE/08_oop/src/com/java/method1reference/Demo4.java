package com.java.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

interface CarFactory {
    Car getCar(String name);
}

public class Demo4 {
    public static void main(String[] args) {
        // 构造器引用
        // 创建了接口的匿名内部类对象
//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                return new Car(name);
//            }
//        };

//        CarFactory cf = name -> new Car(name);

        // 构造器引用： 类名::new
        CarFactory cf = Car::new;

        Car c1 = cf.getCar("大众");
        System.out.println(c1);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Car {
    private String name;
}