package com.java.demo11bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedTest2 {
    public static void main(String[] args) {
        // 出师表排序
        try (
                // 1.创建一个缓冲字符输入流与源文件链接
                BufferedReader br = new BufferedReader(new FileReader("13-file-io/src/csb.txt"));
                // 6.创建一个缓冲字符输入流与目标文件链接
                BufferedWriter bw = new BufferedWriter(new FileWriter("13-file-io/src/csb_out.txt"))
        ) {
            // 2.提前准备一个list集合存储每段内容
            List<String> data = new ArrayList<>();
            // 3.按照行读取数据，存入到data中去
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            // 4.给集合中的每段内容，按照首字符排序
            Collections.sort(data);
            System.out.println(data);
            // 5.遍历集合，将每段内容写入到目标文件中
            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }
            System.out.println("处理完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
