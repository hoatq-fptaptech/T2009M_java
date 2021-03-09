package lab.s5_2;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        super.inputInfo();

        System.out.println("ID:");
        setId(sc.nextInt());
        System.out.println("Mark:");
        setMark(sc.nextInt());
        System.out.println("Email:");
        setEmail(sc.next());


    }

    public void showInfo(){
        // in ra theo thong tin cua student
        super.showInfo();
        System.out.println("Id:"+this.getId());
        System.out.println("Mark:"+this.getMark());
        System.out.println("Email:"+this.getEmail());
    }
}
