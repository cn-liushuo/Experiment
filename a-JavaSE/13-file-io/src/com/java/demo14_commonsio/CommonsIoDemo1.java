package com.java.demo14_commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class CommonsIoDemo1 {
    public static void main(String[] args) throws Exception {
        // IO框架
        FileUtils.copyFile(new File("JavaSE/13-file-io/src/csb.txt"), new File("JavaSE/13-file-io/src/csb_out2.txt"));

        // JDK 7提供的
//        Files.copy(Path.of("JavaSE/13-file-io/src/csb.txt"), Path.of("JavaSE/13-file-io/src/csb_out3.txt"));

        // 删除文件夹
        FileUtils.deleteDirectory(new File("C:\\Users\\lenovo\\Downloads\\commons-io-2.19.0-bin"));
    }
}
