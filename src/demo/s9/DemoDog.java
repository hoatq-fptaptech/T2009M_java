package demo.s9;

import java.util.*;

public class DemoDog {
    public static void main(String[] args){
//        System.out.println("Start program..");
//        Dog d =  new Dog();
//        Dog.k  = 10;
//        d.age = 20;
//        Dog.gogo();
        HashSet<String> hsArr = new HashSet<>();
        hsArr.add("hello");
        hsArr.add("world");
        hsArr.add("world");
        hsArr.add("abc");
        hsArr.add("hello");
        for (String s:hsArr){
            System.out.println(s);
        }
        // vi du nhap 10 so ko trung nhau
//        Scanner sc = new Scanner(System.in);
//        HashSet<Integer> hsInt = new HashSet<>();
//        while (hsInt.size()<10){
//            System.out.println("Nhap so:");
//            int x = sc.nextInt();
//            hsInt.add(x);
//        }

        // hang cho uu tien
        PriorityQueue<Integer> pInt = new PriorityQueue<>();
        pInt.add(9);
        pInt.add(1);
        pInt.add(7);
        pInt.add(8);
        pInt.add(2);
        Iterator<Integer> i = pInt.iterator();
        while (i.hasNext()){
            int x = pInt.poll();
            System.out.println(x);
//            pInt.peek();
        }
        PriorityQueue<Dog> dPr = new PriorityQueue<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.age-o2.age;
            }
        });
        Dog d1 = new Dog();
        d1.age=3;
        Dog d2 = new Dog();
        d2.age=1;
        Dog d3 = new Dog();
        d3.age = 4;
        Dog d4 = new Dog();
        d4.age = 2;
        dPr.add(d1);
        dPr.add(d2);
        dPr.add(d3);
        dPr.add(d4);
        Iterator<Dog> di = dPr.iterator();
        while (di.hasNext()){
            Dog x = dPr.poll();
            System.out.println(x.age);
        }

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("hsgioi",8);
        hm.put("hsyeu",4);
        System.out.println("Hoc sinh gioi bat buoc diem phai tren "+hm.get("hsgioi"));
        System.out.println("Hoc sinh yeu diem duoi "+hm.get("hsyeu"));
    }
}
