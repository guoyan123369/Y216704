package entity;

/**
 * Created by Administrator on 2018/2/3.
 */
public class AnswerInfo {
    private int id;
    private String answer;
    private int Cid;
    private int Ctype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public int getCtype() {
        return Ctype;
    }

    public void setCtype(int ctype) {
        Ctype = ctype;
    }
}
