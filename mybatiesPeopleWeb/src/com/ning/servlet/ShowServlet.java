package com.ning.servlet;

import com.ning.pojo.People;
import com.ning.service.Impl.PeopleServiceImpl;
import com.ning.service.PeopleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//大部分注解都有默认属性，如果注解中只给默认属性赋值，可以省略属性名
//否则在注解的(属性名=属性值)格式
//如果一个属性时是数组类型格式:属性名={值，值}，如果该数组只有一个值，可以省略大括号
//如果类型不是基本数据类型或String，而是一个类类型，语法为 属性=@类型
//注解中@表示引用注解声明
@WebServlet(value={"/a/b/show"})
public class ShowServlet extends HttpServlet {
    private PeopleService ps = new PeopleServiceImpl();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<People> list = ps.show();
        request.setAttribute("list",list);
        // /表示项目根目录  重定向中表示的是服务器根目录
        request.getRequestDispatcher("/show.jsp").forward(request,response);
    }
}
