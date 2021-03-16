package demo.s9;

import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) throws ArithmeticException{
        int z=0;
        try {
            // code can chay ma co the xay ra ngoai le
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y >5){
                throw new ArithmeticException("Nhap so to qua roi");
            }
            x++;
            y--;
            z = x/y;
            System.out.println("z = "+z);
        }catch (ArithmeticException a) {
            System.out.println(a.getMessage());
            // nhung viec se lam khi xay ra ngoai le
        }catch (Exception e){
            System.out.println("Nhap cho dung vao...");
        }finally {
            if(z==0)
                System.out.println("z = "+(z++));
            else
                System.out.println("z = "+z);
        }

    }
}
