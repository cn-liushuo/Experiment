package com.java.demo6collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTraversalDemo5 {
    public static void main(String[] args) {
        // Collection遍历方式3：lambda
        Collection<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("玄冥二老");
        names.add("张三丰");
        names.add("宋青书");
        names.add("殷素素");

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        names.forEach( s -> System.out.println(s));

        names.forEach(System.out::println);

    }
}
