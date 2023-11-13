package com.xiaoma.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Servlet1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/6 16:16
 * @Version 1.0
 */

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet1 is running...");
    }
}
