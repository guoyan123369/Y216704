package entity;

/**
 * Created by Administrator on 2018/2/1.
 */
public class UserInfo {


    private int id;
    private String uname;
    private String upwd;
    private int utype;
    private int utate;

    public void setId(int id) {
        this.id = id;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public void setUtype(int utype) {
        this.utype = utype;
    }

    public void setUtate(int utate) {
        this.utate = utate;
    }

    public int getId() {
        return id;
    }

    public String getUname() {
        return uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public int getUtype() {
        return utype;
    }

    public int getUtate() {
        return utate;
    }
}
