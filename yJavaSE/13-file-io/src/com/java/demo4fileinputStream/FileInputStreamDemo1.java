package com.java.demo4fileinputStream;

import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 掌握文件字节输入流读取文件的字节数组到内存中来。
        // 1、创建文件字节输入流管道于源文件接通
//        InputStream is = new java.io.FileInputStream(new File("13-file-io\\src\\shuo.txt"));
        InputStream is = new java.io.FileInputStream("13-file-io\\src\\shuo.txt");

        // 2、开始读取文件中的字节并输出：每次读取一个字节
        // 定义一个变量记住每次读取的一个字节
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

        is.close();
        // 每次读取一个字节的问题：性能较差，读取汉字输出一定会乱码
    }
}
