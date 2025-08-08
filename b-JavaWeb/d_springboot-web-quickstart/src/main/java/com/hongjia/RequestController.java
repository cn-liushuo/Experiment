package com.hongjia;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        // 1.获取请求方式
        String method = request.getMethod();
        System.out.println("请求方式：" + method);

//        int i = 1/0;

        // 2.获取请求的url地址
        String url = request.getRequestURL().toString(); // http://localhost:8080/request
        System.out.println("请求的url地址：" + url);
        String requestURI = request.getRequestURI(); // /request
        System.out.println("请求的uri地址：" + requestURI);

        // 3.获取请求的协议
        String protocol = request.getProtocol(); // HTTP/1.1
        System.out.println("请求的协议：" + protocol);

        // 4.获取请求参数 - name,age
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("name：" + name + ",age：" + age);

        // 5.获取请求头 - Accept
        String accept = request.getHeader("Accept");
        System.out.println("请求头：" + accept);

        return "OK";
    }
}
