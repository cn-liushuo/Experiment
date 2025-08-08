package com.hongjia.controller;

import com.hongjia.pojo.Result;
import com.hongjia.utils.AliyunOSSOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
public class UpLoadController {

    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;

    /**
     * 本地磁盘存储方案
     */
    /*@PostMapping("/upload")
    public Result upload(String name, Integer age, MultipartFile file) throws Exception {
        log.info("接收到的参数：{},{},{}", name, age, file);
        // 获取原始文件名
        String originalFilename = file.getOriginalFilename(); // 1.jpg

        // 新的文件名
        String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
        String newFilename = UUID.randomUUID().toString() + extension;

        // 保存文件
        file.transferTo(new File("D:/images/" + newFilename));
        return Result.success();
    }*/
    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        log.info("文件上传,{}", file.getOriginalFilename());
        // 将文件交给OSS存储管理
        String url = aliyunOSSOperator.upload(file.getBytes(), file.getOriginalFilename());
        log.info("文件上传OSS,{}", url);
        return Result.success(url);
    }
}
