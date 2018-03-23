package day22.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Administrator on 2018/3/15.
 */
public class AccontDaoimpl extends JdbcDaoSupport implements  AccontDao{
    public boolean updateAccont(int aid, int blance, boolean isBuy) {
        int count=0;
        boolean flag=false;
        if (isBuy){
            String sql="update accont set ablance=ablance-? where aid=? ";
            count=this.getJdbcTemplate().update(sql,blance,aid);
        }else{
            String sql="update accont set ablance=ablance+? where aid=?";
            count=this.getJdbcTemplate().update(sql,blance,aid);
        }
        if (count>0){
            flag=true;
            return flag;
        }{
            return flag;
        }

    }
}