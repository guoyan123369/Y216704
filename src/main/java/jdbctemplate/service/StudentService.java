package jdbctemplate.service;

import jdbctemplate.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
public interface StudentService {
    public List<Student> findAllStudent();
}
