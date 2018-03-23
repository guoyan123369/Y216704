package dao.impl;

import dao.BaseDao;
import dao.examdao;
import entity.examinfo;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2018/2/3.
 */
public class examdaoimpl extends BaseDao implements examdao {

    public boolean addAnswer(List<examinfo> exams) throws Exception {
        List<examinfo> exa=new LinkedList<examinfo>();
        for (examinfo exam:exams)
        {
            String sql="insert into examinfo(id,Sname,Answer) values(default,?,?)";
            int count = this.executeUpdate(sql, exam.getSname(), exam.getAnswer());
        }
        return true;
    }
}
