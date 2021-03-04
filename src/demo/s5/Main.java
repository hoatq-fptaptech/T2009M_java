package demo.s5;

public class Main {
    public static void main(String[] args){
        Human h = new Human();
        h.name = "Nguyen Van Anh";
        h.birthday = "22/1/1999";
        h.run();

        Male m = new Male();
        m.name = "Do Duy Nam";
        m.birthday = "01/1/2000";
        m.run();
        m.weeding();

        VNMale v = new VNMale();
        v.name = "Dao duy anh";
        v.birthday = "9/9/1999";
        v.country = "VN";
        v.run();
        v.weeding();
        v.goToSchool("xin chao cac ban");

        HNMale hn = new HNMale();

    }
}
