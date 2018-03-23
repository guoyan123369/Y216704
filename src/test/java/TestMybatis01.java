
import mybatis.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2018/3/12.
 */
public class TestMybatis01 {
    public static void main(String[] args) {
//        String path="config.xml";
//        try {
//            InputStream is= Resources.getResourceAsStream(path);
//            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
//            SqlSessionFactory factory=builder.build(is);
//            SqlSession session=factory.openSession();
//            List<Book> lists=session.selectList("findAllBook");
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}