package dao;

import entity.UserInfo;

/**
 * Created by Administrator on 2018/2/1.
 */
public interface Userinfodao {
    public UserInfo islogin(String name, String pwd) throws Exception;
}
