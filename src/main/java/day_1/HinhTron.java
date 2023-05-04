package day_1;

import static java.lang.Math.pow;

public class HinhTron {
    private double BanKinh = 1.0f;
    private double pi = 3.14;

    public HinhTron(){}
    public HinhTron(double BanKinh, double pi){
        this.BanKinh = BanKinh;
        this.pi = pi;
    }

    public double getBanKinh() {
        return BanKinh;
    }

    public void setBanKinh(double banKinh) {
        BanKinh = banKinh;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double ChuVi(){
        return 2*pi*BanKinh;
    }
    public double DienTich(){
        return pi*BanKinh*BanKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "BanKinh=" + BanKinh +
                ", pi=" + pi +
                "ChuVi" + ChuVi() +
                "DienTich" + DienTich() +
                '}';
    }
}
