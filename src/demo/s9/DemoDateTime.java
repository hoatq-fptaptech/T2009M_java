package demo.s9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DemoDateTime {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        System.out.println("Hom nay:"+ld);
        System.out.println("Ngay mai:"+ld.plusDays(1));
        System.out.println("Ngay hom qua:"+ld.minusDays(1));
        System.out.println("Ngay kia:"+ld.plusDays(2));
        System.out.println("Ngay nay nam sau:"+ld.plusYears(1));
        System.out.println("Ngay nay tuan sau sau:"+ld.plusWeeks(1));
        System.out.println("Hom nay la ngay thu "+ld.getDayOfYear() + "  cua nam");
        System.out.println("Hom nay la ngay thu "+ld.getDayOfMonth() + "  cua thang");
        System.out.println("Dang la thang: "+ld.getMonthValue());
        System.out.println("Dang la thang: "+ld.getMonth());
        System.out.println("Dang la thu: "+ld.getDayOfWeek());

        LocalDate ld2 = LocalDate.parse("1999-10-12");
        int ngay = ld2.getDayOfMonth();
        int thang = ld2.getMonthValue();
        if(ngay == ld.getDayOfMonth() && thang == ld.getMonthValue()){
            System.out.println("Happy birthday!");
        }

        LocalDate ld3= LocalDate.of(2000,3,16);
        int ngay2 = ld3.getDayOfMonth();
        int thang2 = ld3.getMonthValue();
        if(ngay2 == ld.getDayOfMonth() && thang2 == ld.getMonthValue()){
            System.out.println("Happy birthday!");
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("NHap vao nam muon kiem tra:");
//        int y = sc.nextInt();
//        LocalDate nn = LocalDate.of(y,12,31);
//        if(nn.getDayOfYear() == 366){
//            System.out.println("DAy la nam nhuan");
//        }
//        LocalDate nn2 = LocalDate.of(y,2,28);
//        if(nn2.plusDays(1).getDayOfMonth() == 29){
//            System.out.println("DAy la nam nhuan");
//        }

        LocalDateTime t = LocalDateTime.now();
        System.out.println("ngay luc nay:"+t);
        System.out.println("ngay mai vao luc nay:"+t.plusDays(1));
        System.out.println("mot tieng nua:"+t.plusHours(1));
        System.out.println("mot luc nua:"+t.plusMinutes(15));
        System.out.println("mot teo nua:"+t.plusSeconds(10));
        System.out.println("mot teo teo nua:"+t.plusNanos(55));

        LocalDateTime t2 = LocalDateTime.of(2021,3,16,11,30,15,55);
        System.out.println("ngay luc nay:"+t2);
        System.out.println("ngay mai vao luc nay:"+t2.plusDays(1));
        System.out.println("mot tieng nua:"+t2.plusHours(1));
        System.out.println("mot luc nua:"+t2.plusMinutes(15));
        System.out.println("mot teo nua:"+t2.plusSeconds(10));
        System.out.println("mot teo teo nua:"+t2.plusNanos(55));
    }
}
