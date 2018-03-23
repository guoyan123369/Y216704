package jdbctemplate.Dao;

import autowire.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
public class StudentDaoimpl extends JdbcDaoSupport implements StudentDao {

    public List<jdbctemplate.entity.Student> findAllStudent() {
        String sql="select * from student";
        List<jdbctemplate.entity.Student> stu=this.getJdbcTemplate().query(sql, new RowMapper<jdbctemplate.entity.Student>() {

            public jdbctemplate.entity.Student mapRow(ResultSet resultSet, int i) throws SQLException {
                jdbctemplate.entity.Student stu=new jdbctemplate.entity.Student();
                stu.setId(resultSet.getInt("id"));
                stu.setName(resultSet.getString("name"));
                stu.setSex(resultSet.getInt("sex"));
                stu.setBirthday(resultSet.getString("birthday"));
                return stu;
            }
        });
        return stu;
    }
}