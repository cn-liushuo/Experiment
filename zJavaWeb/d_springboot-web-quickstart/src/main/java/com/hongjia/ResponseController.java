package com.hongjia;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    // 响应状态码和响应头没有特殊情况不需要手动指定

    /**
     * 方式一：HttpServletResponse 设置响应数据
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws Exception {
        // 1.设置响应状态码
        response.setStatus(401);
        // 2.设置响应头
        response.setHeader("Content-Type", "text/html;charset=utf-8");
        // 3.设置响应体
        response.getWriter().write("<h1>Java Web</h1>");
    }

    /**
     * 方式二：ResponseEntity 设置响应数据 Spring中提供的方式
     *
     * @return
     */
    @RequestMapping("/response2")
    public ResponseEntity<String> response2() {
        return ResponseEntity
                .status(401)
                .header("name", "javaweb-ai")
                .body("<h1>Java Web</h1>");
    }
}
