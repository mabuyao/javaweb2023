package com.xiaoma.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName: Servlet5
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/7 16:13
 * @Version 1.0
 */
@WebServlet("/servlet5")
public class Servlet5 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info = "<h1>hello</h1>";
        //设置响应状态
        resp.setStatus(200);
        //设置响应头相关的API
        //resp.setHeader("aaa","valuea");
        resp.setContentType("text/html");
        resp.setContentLength(info.getBytes().length);
        //设置响应体内容的API
        //获得一个向响应体中输入文本字符输出流
        PrintWriter writer = resp.getWriter();
        writer.write(info);

        //获得一个向响应体中输入二进制信息的字节输出流
        //ServletOutputStream outputStream = resp.getOutputStream();
    }
}
