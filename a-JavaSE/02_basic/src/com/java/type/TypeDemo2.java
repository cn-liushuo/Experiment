package com.java.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        // 目标：理解表达式的自动类型提升
    }

    public static double calc(int a, int b, double d, char c) {
        // 表达式的最终结果是由最高类型决定的
        return a + b + d + c;
    }

    public static int calc(byte a, byte b) {
        // byte short char 运算时会直接提升成 int 运算。
        return a + b;
    }

    public static byte calc1(byte b, byte a) {
        return (byte) (a + b);
    }
}
