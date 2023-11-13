package com.xiaoma.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: Servlet3
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/7 11:08
 * @Version 1.0
 */
@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        //向upload目录中写入一个文件
        //获得一个指向项目部署位置下的某个文件/目录的磁盘真实路径的API
        String path = servletContext.getRealPath("upload");
        FileOutputStream fos = new FileOutputStream(path + "/a.txt");
        System.out.println(path);

        //获得项目部署的上下文路径 项目的访问路径
        //后续我们会学习在项目中使用相对和绝对路径找目标资源
        //servlet1   /demo02/servlet1
        //获取项目的上下文路径 项目的访问路径
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);
    }
}
