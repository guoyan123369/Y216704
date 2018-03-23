import day22.service.AccontService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Administrator on 2018/3/15.
 */
public class day22 {
    @Test
    public void mains() {
         ApplicationContext con=new ClassPathXmlApplicationContext("day22.xml");
        AccontService ser=(AccontService) con.getBean("Service");
        ser.ASpy(1,1000,1,10,true);
    }
}