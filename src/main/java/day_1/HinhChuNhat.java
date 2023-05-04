package day_1;

public class HinhChuNhat {
    private float chieurong = 1.0f;
    private float chieudai = 1.0f;

    public HinhChuNhat(){}
    public HinhChuNhat(float chieudai, float chieurong){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public float ChuVi(){
        return (chieurong + chieudai) * 2;
    }
    public  float DienTich(){
        return chieudai*chieurong;
    }

}
