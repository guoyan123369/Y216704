package dao.impl;

import dao.BaseDao;
import dao.Userinfodao;
import entity.UserInfo;

import java.sql.ResultSet;

/**
 * Created by Administrator on 2018/2/1.
 */
public class Userinfodaoimpl extends BaseDao implements Userinfodao{
    public UserInfo islogin(String name, String pwd) throws Exception {
        String  sql="select * from logininfo where uname=? and upwd=?";
        ResultSet rs = this.executeQuery(sql,name,pwd);
        UserInfo user=new UserInfo();
        if(rs.next()){

            user.setUname(rs.getString("uname"));
            user.setUpwd(rs.getString("upwd"));

        }
        return user;
    }
}
