package homework.Servlet;

import homework.Bean.UserInfoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "Login",urlPatterns = "/Login")
public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        ApplicationContext context = new ClassPathXmlApplicationContext("HomeWorkContext.xml");
        UserInfoBean user = (UserInfoBean)context.getBean("user");
        if (pwd.equals(user.getMap().get(name))){
            request.getRequestDispatcher(request.getContextPath()+"/Welcome.jsp").forward(request,response);
        }else request.getRequestDispatcher(request.getContextPath()+"/Login.jsp").forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);

    }
}
