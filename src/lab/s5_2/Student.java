package lab.s5_2;

public class Student extends Person {
    public int id;
    public int mark;
    public String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputInfo(){
        // nhap lai theo thong tin cua student
    }

    public void showInfo(){
        // in ra theo thong tin cua student
    }
}
