package com.java.demo3charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 写程序实现字符编码和解码
        // 1、编码
        String name = "中国";

//        byte[] bytes = name.getBytes(); // 平台的UTF-8编码。
        byte[] bytes = name.getBytes("GBK"); // 指定GBK编码。
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 2、解码
        // String name2 = new String(bytes); // 平台的UTF-8解码。
        String name2 = new String(bytes, "GBK");
        System.out.println(name2);
    }
}
