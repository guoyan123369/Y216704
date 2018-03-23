package service.impl;

import dao.Userinfodao;
import dao.impl.Userinfodaoimpl;
import entity.UserInfo;
import service.Userservice;

/**
 * Created by Administrator on 2018/2/1.
 */
public class Userserviceimpl implements Userservice{
    Userinfodao dao=new Userinfodaoimpl();

    public UserInfo islogin(String name, String pwd) throws Exception {
        return dao.islogin(name, pwd);
    }
}
