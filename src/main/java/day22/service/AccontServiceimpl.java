package day22.service;

import day22.Dao.AccontDao;
import day22.Dao.StockDao;
import day22.entity.Stock;

/**
 * Created by Administrator on 2018/3/15.
 */
public class AccontServiceimpl implements  AccontService{
    private AccontDao accontDao;

    public AccontDao getAccontDao() {
        return accontDao;
    }

    public void setAccontDao(AccontDao accontDao) {
        this.accontDao = accontDao;
    }

    public day22.Dao.StockDao getStockDao() {
        return StockDao;
    }

    public void setStockDao(day22.Dao.StockDao stockDao) {
        StockDao = stockDao;
    }

    private StockDao StockDao;
    public boolean ASpy(int aid, int ablance, int sid, int scount, boolean isBuy) {
        boolean accont = accontDao.updateAccont(aid, ablance, isBuy);
        boolean stock = StockDao.updateStock(sid, scount, isBuy);
        if(accont&&stock){
            return  true;
        }else {
            return false;
        }
    }
}