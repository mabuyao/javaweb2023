package com.xiaoma.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * ClassName: Servlet1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/7 10:38
 * @Version 1.0
 */
@WebServlet(
        urlPatterns = "/servlet2",
        initParams = {@WebInitParam(name = "key2a", value = "value2a"), @WebInitParam(name = "key2b", value = "value2b")}
)
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----------------------ServletConfig获取参数---------------------------");
        ServletConfig servletConfig = getServletConfig();
        //获取初始配置信息即可
        //根据参数名获取参数值
        String key2a = servletConfig.getInitParameter("key2a");
        System.out.println("key2a: " + key2a);

        //获取所有初始参数的名字  Enumeration为早期的迭代器
        //hasMoreElements  判断有没有下一个元素 有true 无false
        //nextElement      取出下一个元素  向下移动游标
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String pname = initParameterNames.nextElement();
            System.out.println(pname + ": " + getInitParameter(pname));
        }

        System.out.println("----------------------ServletContext获取参数---------------------------");
        //获取ServletContext
        ServletContext servletContext = getServletContext();
        ServletContext servletContext1 = servletConfig.getServletContext();
        ServletContext servletContext2 = req.getServletContext();
        System.out.println(servletContext == servletContext1);
        System.out.println(servletContext2 == servletContext1);

        String encoding = servletContext.getInitParameter("encoding");
        System.out.println("encoding: " + encoding);

        Enumeration<String> parameterNames = servletContext.getInitParameterNames();
        while (parameterNames.hasMoreElements()){
            String pname = parameterNames.nextElement();
            System.out.println(pname + " = " + servletContext.getInitParameter(pname));
        }

        //从域对象中读取数据
        String ka = (String)servletContext.getAttribute("ka");
        System.out.println(ka);
    }
}
