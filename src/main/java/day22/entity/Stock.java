package day22.entity;/**
 * Created by Administrator on 2018/3/15.
 */
public class Stock {
    private  Integer sid;
    private  String sname;
    private  Integer scount;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getScount() {
        return scount;
    }

    public void setScount(Integer scount) {
        this.scount = scount;
    }
}