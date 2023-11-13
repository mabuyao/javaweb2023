package com.xiaoma.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: Servlet4
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/7 15:35
 * @Version 1.0
 */
@WebServlet("/servlet4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受请求中的键值对形式的参数
        //根据参数名获得单个参数值
        String username = req.getParameter("username");
        System.out.println(username);
        String password = req.getParameter("password");
        System.out.println(password);
        //根据参数名获得多个参数值
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

        //获取所有参数名
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String pname = parameterNames.nextElement();
            String[] values = req.getParameterValues(pname);
            if(values.length > 1){
                System.out.println(pname + " = " + Arrays.toString(values));
            }else {
                System.out.println(pname + " = " + values[0]);
            }
        }

        //返回所有参数的map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            String pname = entry.getKey();
            String[] value = entry.getValue();
            if(value.length > 1){
                System.out.println(pname + " = " + Arrays.toString(value));
            }else {
                System.out.println(pname + " = " + value[0]);
            }
        }
    }
}
