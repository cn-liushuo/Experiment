package com.java.staticmethod;

public class Test3 {
    public static void main(String[] args) {
        // 静态方法的应用，可以做工具类
        // 注册界面
        // 开发一个验证码程序
        String code = VerifyCodeUtil.getCode(6);
        System.out.println(code);

    }
}
