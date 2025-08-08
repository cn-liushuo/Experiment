package com.java.demo1file;

import java.io.File;
import java.util.Arrays;

public class FileDemo2 {
    public static void main(String[] args) {
//        目标：掌握File便利一级文件对象的操作
        File dir = new File("D:/resource/liushuo.txt");
        File dir2 = new File("D:/resource/empty");

        /*
         * 当主调是文件，或者路径不存在时，返回null
         * 当主调是空文件夹时，返回一个长度为0的数组
         * 当主调是一个有内容的文件夹时，将里面所有一级文件和路径放在File数组中返回
         * 当主调是一个文件夹，且里面有隐藏文件时，将里面的所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
         * 当主调是一个文件夹，但是没有权限范文该文件夹是，返回null
         * */
        File[] files = dir2.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
