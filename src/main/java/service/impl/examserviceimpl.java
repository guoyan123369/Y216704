package service.impl;

import dao.examdao;
import dao.impl.examdaoimpl;
import entity.examinfo;
import service.examservice;

import java.util.List;

/**
 * Created by Administrator on 2018/2/3.
 */
public class examserviceimpl implements examservice {
    examdao dao=new examdaoimpl();
    public boolean addAnswer(List<examinfo> exams) throws Exception {
        return dao.addAnswer(exams);
    }
}
