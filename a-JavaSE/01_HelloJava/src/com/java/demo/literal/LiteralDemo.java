package com.java.demo.literal;

/**
 * 目标：掌握常见字面量的书写格式
 */
public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }

    public static void printLiteral() {
        // 1.整形字面量
        System.out.println(1);
        // 2.浮点型字面量
        System.out.println(1.0);
        // 3.布尔型字面量
        System.out.println(true);
        // 4.字符字面量
        System.out.println('a');
        // 5.字符串字面量
        System.out.println("hello");
        // 6.特殊的字符 \n(换行) \t(缩进)
        System.out.println("Hello\nJava");
        System.out.println("Hello\tJava");
    }
}
