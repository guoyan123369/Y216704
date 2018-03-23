package SpringTable.servlet;
import SpringTable.service.StudentService;
import service.Userservice;
import service.impl.Userserviceimpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Administrator on 2018/3/17.
 */
public class Servlet extends HttpServlet{StudentService ser;
    public StudentService getSer() {
        return ser;
    }
    public void setSer(StudentService ser) {
        this.ser = ser;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int count = ser.insertStudent("name", birthday);
        if(count>0){
            request.getRequestDispatcher("/success.jsp").forward(request,response);
        }else{
            response.sendRedirect("02Spring/success.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}