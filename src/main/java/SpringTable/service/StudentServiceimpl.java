package SpringTable.service;

import SpringTable.Dao.StudentDao;
import SpringTable.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
public class StudentServiceimpl implements StudentService {
    StudentDao dao;

    public int insertStudent(String name, String bir) {
        return dao .insertStudent(name,bir);
    }
}