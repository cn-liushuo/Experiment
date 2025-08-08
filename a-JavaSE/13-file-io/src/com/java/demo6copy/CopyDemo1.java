package com.java.demo6copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo1 {
    public static void main(String[] args) {
        // 使用字节流完成文件的复制操作
        // 源文件：C:\Users\lenovo\Pictures\ship.jpg
        // 目标文件：D:\jt_copy.jpg (复制过去的时候必须带文件名的，无法自动生成文件名)
        copyFiles("C:\\Users\\lenovo\\Pictures\\ship.jpg", "D:\\jt_copy.jpg");

    }

    // 复制文件
    public static void copyFiles(String srcPath, String desPath) {
        // 1.创建一个文件字节输入流管道与源文件接通
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(desPath);
            // 2.读取一个字节数组，写入一个字节数组
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len); // 读取多少个字节，就写入多少个字节
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 最后一定会执行一次，即便程序出现异常
            // 3.关闭资源
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
