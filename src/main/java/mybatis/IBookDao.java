package mybatis;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12.
 */
public interface IBookDao {
    public List<Book> findAllBook();
}
