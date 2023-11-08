package hello.servelet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


//1.파라미터 전송 기능
//http://localhost:8090/request-param?username=sun&age=20


@WebServlet(name="requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("RequestParamServlet.service -start");

        req.getParameterNames().asIterator()
                        .forEachRemaining(paramName -> System.out.println(paramName + "=" + req.getParameter(paramName)));
        System.out.println("RequestParamServlet.service -end");
        System.out.println();

        System.out.println("[단일 파라미터 조회]");
        String username = req.getParameter("username");
        String age = req.getParameter("age");

        System.out.println("username = " + username);
        System.out.println("age = " + age);
        System.out.println();

        resp.getWriter().write("Get ok");




    }
}
