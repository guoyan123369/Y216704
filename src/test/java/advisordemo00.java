import SpringAdvisor.bookservice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/3/8.
 */
public class advisordemo00{
    @Test
    public void t1(){
        ApplicationContext con=new ClassPathXmlApplicationContext("advisor.xml");
        bookservice ser=(bookservice) con.getBean("ser");
        ser.name();
        ser.dele();

    }
}