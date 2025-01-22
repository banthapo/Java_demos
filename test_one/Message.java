package test_one;

import java.util.Date;
import java.util.LinkedList;

public class Message extends Contact {
    private String msg;
    private Date date;

    public Message(String firstName, String surname, String email, int age, long phone, String msg, Date date) {
        super(firstName, surname, email, age, phone);
        this.msg = msg;
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
