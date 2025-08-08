package com.java.demo4fileinputStream;

import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        // 掌握文件字节输入流读取文件的字节数组到内存中来。
        // 1、创建文件字节输入流管道于源文件接通
//        InputStream is = new java.io.FileInputStream(new File("13-file-io\\src\\shuo.txt"));
        InputStream is = new java.io.FileInputStream("13-file-io\\src\\shuo.txt");

        // 2、一次性读完文件的全部字节：避免读取汉字输出乱码的问题
        byte[] buffer = is.readAllBytes();

        String rs = new String(buffer);
        System.out.println(rs);

        is.close();
    }
}
