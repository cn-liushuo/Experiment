package com.java.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 扩展的赋值运算符
        receive(5);
        print();
    }

    public static void receive(int money) {
        // 拿到自己钱包的金额
        int a = 100;
        a += money; // 等价于 a = a + b
        System.out.println(a);

        byte a1 = 10;
        byte a2 = 20;
        a1 += a2; // 等价于 a1 = (byte)(a1 + a2)  扩展赋值运算符自带强制类型转换
        System.out.println(a1);
    }

    public static void print() {
        int a = 10;
        a -= 5; // 等价于 a = (a的类型) (a - 5)
        System.out.println(a);

        int b = 10;
        b *= 5; // 等价于 b = (b的类型) (b * 5)
        System.out.println(b);

        int c = 10;
        c /= 5; // 等价于 c = (c的类型) (c / 5)
        System.out.println(c);

        int d = 10;
        d %= 5; // 等价于 d = (d的类型) (d % 5)
        System.out.println(d);
    }
}
