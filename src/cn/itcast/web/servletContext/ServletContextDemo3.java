package cn.itcast.web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextDemo3")
public class ServletContextDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            SerletContext功能：
            1.获取MIME类型：
                *MIME类型：再互联网通信过程中定义的一种文件数据类型
                    *格式：大类型/小类型		text/heml	image/jpg
                *获取：String getMimeType（String ile）
            2.域对象：共享数据
            3.获取文件得真实（服务器）路径
         */
        //1.通过HttpServlet获取对象
        ServletContext context = this.getServletContext();

        //3.设置数据
        context.setAttribute("msg", "haha");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
