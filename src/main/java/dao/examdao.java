package dao;

import entity.examinfo;

import java.util.List;

/**
 * Created by Administrator on 2018/2/1.
 */
public interface examdao {
    public boolean addAnswer(List<examinfo> exams) throws Exception;
}
