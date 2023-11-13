package com.xiaoma.schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * ClassName: BaseController
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/8 17:16
 * @Version 1.0
 */
public class BaseController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //判断此次请求是 增？ 删？ 改？ 查？
        String requestURI = req.getRequestURI();// 例如/schedule/add
        String[] split = requestURI.split("/");
        String methodName = split[split.length - 1];

        //使用反射 通过方法名获取下面的方法
        Class aClass = this.getClass();
        //获取方法
        try {
            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //暴力破解方法的访问修饰符的限制
            declaredMethod.setAccessible(true);
            //执行方法
            declaredMethod.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
