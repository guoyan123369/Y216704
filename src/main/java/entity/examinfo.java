package entity;

/**
 * Created by Administrator on 2018/2/3.
 */
public class examinfo {
    private int id;
    private String sname;
    private int Aid;
    private String Answer;
    private int Cid;
    private String Ctype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getCtype() {
        return Ctype;
    }

    public void setCtype(String ctype) {
        Ctype = ctype;
    }
}

