package com.java.demo8filewriter;

import java.io.FileWriter;

public class FileWriterDemo1 {
    public static void main(String[] args) {
        // 文件字符输出流的使用：写字符出去的流
        // 1.创建一个字符输出流对象，指定写出的目的地
        try (
                // 1.创建一个字符输出流对象，指定写出目的地。
//                FileWriter fw = new FileWriter("13-file-io/src/shuo02.txt"); // 覆盖管道
                FileWriter fw = new FileWriter("13-file-io/src/shuo02.txt", true); // 追加数据
        ) {
            // 2.写一个字符出去
            fw.write('a');
            fw.write(98);
            fw.write('铄');
            fw.write("\r\n"); // 换行

            // 3.写一个字符串出去
            fw.write("java");
            fw.write("我爱java");
            fw.write("\r\n"); // 换行

            // 4.写字符串的一部分出去
            fw.write("java", 1, 2);
            fw.write("\r\n"); // 换行

            // 5.写一个字符数组出去
            char[] chars = "java".toCharArray();
            fw.write(chars);
            fw.write("\r\n"); // 换行

            // 6.写字符数组的一部分出去
            fw.write(chars, 1, 2);
            fw.write("\r\n"); // 换行

            // fw.flush(); // 刷新缓冲区，将缓冲区的数据全部写出去。
            // 刷新后，流可以继续使用。
            // fw.close(); // 关闭资源，关闭包含了刷新！关闭后流不能继续使用！
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
