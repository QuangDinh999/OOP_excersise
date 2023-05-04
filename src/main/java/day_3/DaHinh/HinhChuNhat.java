package day_3.DaHinh;

public class HinhChuNhat {
    double ChieuDai = 1.0;
    double ChieuRong = 1.0;

    public HinhChuNhat() {

    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        ChieuDai = chieuDai;
        ChieuRong = chieuRong;
    }

    public double getChieuDai() {
        return ChieuDai;
    }

    public void setChieuDai(double chieuDai) {
        ChieuDai = chieuDai;
    }

    public double getChieuRong() {
        return ChieuRong;
    }

    public void setChieuRong(double chieuRong) {
        ChieuRong = chieuRong;
    }

    public double ChuVi(){
        return (ChieuDai + ChieuRong)*2;
    }

    public double DienTich(){
        return ChieuRong*ChieuDai;
    }
}
