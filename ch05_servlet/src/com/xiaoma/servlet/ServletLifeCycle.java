package com.xiaoma.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: ServletLifeCycle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/6 17:18
 * @Version 1.0
 */
@WebServlet(value = "/servletLifeCycle",loadOnStartup = 8)
public class ServletLifeCycle extends HttpServlet {
    public ServletLifeCycle() {
        System.out.println("construct...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service...");
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
