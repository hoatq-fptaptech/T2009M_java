package lab.s5;

public class TamGiac {
    public double canh1;
    public double canh2;
    public double canh3;

    public double chuVi(){
        return canh1+canh2+canh3;
    }

    public double dienTich(){
        double p = chuVi()/2;
        return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
    }
}
