package demo.s9;

public class DemoLambda {
    public static void main(String[] args){
        double x = 1.5;
        // tao doi tuong tu lop an danh
        NhanVien nv = new NhanVien() {
            @Override
            public void nhanLuong() {
                System.out.println("luong vo he so: "+x);
            }

            public void nhanThuong() {

            }
        };
        nv.nhanLuong();

        // tao doi tuong kieu lambda expression
        NhanVien nv2 = ()->{
            System.out.println("luong vo he so: "+x);
        };
        nv2.nhanLuong();
    }
}
