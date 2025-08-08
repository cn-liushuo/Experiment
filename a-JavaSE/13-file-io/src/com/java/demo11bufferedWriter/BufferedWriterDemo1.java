package com.java.demo11bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo1 {
    public static void main(String[] args) {
        // 缓冲字符输出流的使用：写字符出去的流
        // 1.创建一个字符输出流对象，指定写出的目的地
        try (
                // 1.创建一个字符输出流对象，指定写出目的地。
//                FileWriter fw = new FileWriter("13-file-io/src/shuo02.txt"); // 覆盖管道
                Writer fw = new FileWriter("13-file-io/src/shuo02.txt", true); // 追加数据
                // 2.创建一个缓冲字符输出流对象
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            // 2.写一个字符出去
            bw.write('a');
            bw.write(98);
            bw.write('铄');
            bw.newLine(); // 换行

            // 3.写一个字符串出去
            bw.write("java");
            bw.write("我爱java");
            bw.newLine(); // 换行

            // 4.写字符串的一部分出去
            bw.write("java", 1, 2);
            bw.newLine(); // 换行

            // 5.写一个字符数组出去
            char[] chars = "java".toCharArray();
            bw.write(chars);
            bw.newLine(); // 换行

            // 6.写字符数组的一部分出去
            bw.write(chars, 1, 2);
            bw.newLine(); // 换行
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
