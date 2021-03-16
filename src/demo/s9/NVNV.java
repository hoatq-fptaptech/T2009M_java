package demo.s9;

public class NVNV implements NhanVien {
    double heso;

    public NVNV(double heso) {
        this.heso = heso;
    }

    @Override
    public void nhanLuong() {
        System.out.println("luong vo he so: "+heso);
    }
}
