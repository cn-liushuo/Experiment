package com.java.demo3annotation;

public @interface A {
    String value(); // 特殊属性：在使用时如果只有一个value属性，那么value名称可以不写

    String hobby() default "打篮球";
}
