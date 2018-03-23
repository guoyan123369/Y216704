package jdbctemplate.Dao;

import jdbctemplate.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
public interface StudentDao {
    public List<Student> findAllStudent();
}
