package day22.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Administrator on 2018/3/15.
 */
public class StockDaoimpl extends JdbcDaoSupport implements StockDao{
    public boolean updateStock(int sid, int scount, boolean isBuy) {
        boolean flag=false;
        int count=0;
        if(isBuy){
            String sql="update stock set scount=scount+? where sid=?";
            count=this.getJdbcTemplate().update(sql,scount,sid);
        }{
            String sql="update stock set scount=scount-? where sid=?";
            count=this.getJdbcTemplate().update(sql,scount,sid);
        }
        if(count>0){
            return true;
        }{
            return false;
        }

    }
}