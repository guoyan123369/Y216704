package service;

import entity.examinfo;

import java.util.List;

/**
 * Created by Administrator on 2018/2/3.
 */
public interface examservice {
    public boolean addAnswer(List<examinfo> exams) throws Exception;
}

