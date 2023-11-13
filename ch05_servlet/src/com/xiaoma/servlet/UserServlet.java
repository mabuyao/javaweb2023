package com.xiaoma.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName: UserServlet
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/6 15:16
 * @Version 1.0
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.从request对象中获取请求中的任何信息（username参数）
        String username = req.getParameter("username");// 根据参数名获得参数值，get post都可用

        //2.处理业务的代码
        String info = "<h1>YES</h1>";
        if("xiaoma".equals(username)){
            info = "<h1>NO</h1>";
        }

        //3.将要响应的数据放入response
        //应该设置Content-Type响应头
        //resp.setHeader("Content-Type","text/html");
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();//该方法返回的是一个向响应体中打印字符串的打印流
        writer.write(info);
    }
}
