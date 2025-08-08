package com.java.demo7tcp4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable {
    private Socket socket;

    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 读取管道的消息
        try {
            // 给当前对应的浏览器管道相应一个网页数据回去
            OutputStream os = socket.getOutputStream();
            // 通过字节输入流包装写出去数据给浏览器
            // 把字节输出流包装成打印流
            PrintStream ps = new PrintStream(os);
            // 写响应的网页数据出去
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type: text/html; charset=utf-8");
            ps.println(); // 必须换一行
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset=\"utf-8\">");
            ps.println("<title>");
            ps.println("Java网页");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1 style='color:red;font-size=20px'>Java学习</h1>");
            ps.println("</body>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("客户端下线了" + socket.getInetAddress().getHostAddress());
        }
    }
}
