package day_2;

public class HinhChuNhat {
    private double chieudai = 1.0;
    private double chieurong = 1.0;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieudai, double chieurong) {
        if(chieudai <= 0 || chieurong <= 0){
            throw new RuntimeException("Canh Phai Duong !");
        }
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        if(chieudai <= 0){
            throw new RuntimeException("Canh Phai Duong !");
        }
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        if(chieurong <= 0){
            throw new RuntimeException("Canh Phai Duong !");
        }
        this.chieurong = chieurong;
    }

    public double ChuVi() {
        return (chieudai + chieurong)*2;
    }

    public double DienTich() {
        return chieudai*chieurong;
    }

}
