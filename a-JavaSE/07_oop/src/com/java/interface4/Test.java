package com.java.interface4;

public class Test {
    public static void main(String[] args) {
        // 接口新增的三种方法
        AImpl a = new AImpl();
        a.go();

        A.show(); // 静态方法
    }
}

class AImpl implements A {

}
