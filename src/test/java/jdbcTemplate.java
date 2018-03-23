import SpringAdvisor.bookservice;
import jdbctemplate.entity.Student;
import jdbctemplate.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
public class jdbcTemplate {
    @Test
    public void test0(){
        ApplicationContext con=new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        StudentService ser=(StudentService) con.getBean("StudentService");
        List<Student> list = ser.findAllStudent();
        for (Student stu:list) {
            stu.getName();
        }
    }

}