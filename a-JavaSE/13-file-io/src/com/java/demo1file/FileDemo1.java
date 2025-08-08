package com.java.demo1file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建File创建对象代表文件（文件\目录），搞清楚其提供的对文件进行操作的方法
        // 1、创建File对象，去获取某个文件的信息
//        File f1 = new File("D:\\resource\\abc.txt");
        File f1 = new File("D:/resource/abc.txt");

        System.out.println(f1.length()); // 字节个数
        System.out.println(f1.getName()); // 文件名字
        System.out.println(f1.isFile()); // 是否为文件
        System.out.println(f1.isDirectory()); // 是否为文件夹

        // 2、可以使用相对路径定位文件的对象
        // 只要带盘符的都称之为：绝对路径D:/resource/abc.txt
        // 相对路径：不带盘符，默认是到你的idea工程下直接寻找文件的。一般用来找工程下的项目文件的。
        File f2 = new File("13-file-io\\src\\LIUSHUO1.txt");
        System.out.println(f2.length());
        System.out.println(f2.getAbsoluteFile()); // 获取绝对路径

        // 3、创建对象代表不存在呃呃文件路径。
        File f3 = new File("D:\\resource\\liushuo01.txt");
        System.out.println(f3.exists()); // 判断是否存在
        System.out.println(f3.createNewFile()); // 把这个文件创建出来

        // 4、船舰对象代表不存在的文件夹路径
        File f4 = new File("D:\\resource\\aaa");
        System.out.println(f4.mkdir()); // mkdir 只能创建一级文件夹

        File f5 = new File("D:\\resource\\bbb\\ccc\\ddd");
        System.out.println(f5.mkdirs()); // mkdirs可以创建多级文件夹，很重要！

        // 5、创建File对象代表存在的文件，然后删除它
        File f6 = new File("D:\\resource\\liushuo01.txt");
        System.out.println(f6.delete()); // 删除文件

        // 6、创建File对象代表存在的文件夹，然后删除它
        File f7 = new File("D:\\resource\\aaa");
        System.out.println(f7.delete()); // 只能删除空文件夹，不能删除非空文件夹

        File f8 = new File("D:\\resource");
        System.out.println(f8.delete()); // 只能删除空文件夹，不能删除非空文件夹

        // 8、可以获取某个目录下的全部一级文件名称
        File f9 = new File("D:\\resource");
        String[] names = f9.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 9、
        File[] files = f9.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile()); // 获取绝对路径
//            file.delete(); // 删除
        }
    }
}
