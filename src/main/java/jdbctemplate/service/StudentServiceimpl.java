package jdbctemplate.service;

import jdbctemplate.Dao.StudentDao;
import jdbctemplate.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
public class StudentServiceimpl implements  StudentService{
    StudentDao dao;

    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    public List<Student> findAllStudent() {
        return dao.findAllStudent();
    }
}