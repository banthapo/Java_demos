package test_one;

public class Message extends Contact {
    private String msg;
    private String date;

    public Message(String firstName, String surname, String email, int age, int phone, String msg, String date) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
