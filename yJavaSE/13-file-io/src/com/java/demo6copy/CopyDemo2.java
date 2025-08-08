package com.java.demo6copy;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) {
        // 掌握关闭资源的新方式：try-catch-resource
        // 源文件：C:\Users\lenovo\Pictures\ship.jpg
        // 目标文件：D:\jt_copy.jpg (复制过去的时候必须带文件名的，无法自动生成文件名)
        copyFiles("C:\\Users\\lenovo\\Pictures\\ship.jpg", "D:\\jt_copy.jpg");

    }

    // 复制文件
    public static void copyFiles(String srcPath, String desPath) {
        // 1.创建一个文件字节输入流管道与源文件接通
        try (
                // 这里只能放置资源对象，用完后，最终会自动调用其close方法关闭！！
                FileInputStream fis = new FileInputStream(srcPath);
                FileOutputStream fos = new FileOutputStream(desPath);
                MyConn conn = new MyConn(); // 自定义的资源对象
        ) {
            // 2.读取一个字节数组，写入一个字节数组
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len); // 读取多少个字节，就写入多少个字节
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConn implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("关闭了");
    }
}
