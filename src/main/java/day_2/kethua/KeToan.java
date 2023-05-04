package day_2.kethua;

public class KeToan extends NhanVIen{
    private String BangCap;
    private String maTruongPhong;


    public KeToan(String maNhanVien, String tenNhanVien) {
        super(maNhanVien, tenNhanVien);
    }

    public KeToan(String maNhanVien, String tenNhanVien, String ngaySinh, boolean gioiTinh, String luong, String BangCap, String maTruongPhong) {
        super(maNhanVien, tenNhanVien, ngaySinh, gioiTinh, luong);
        this.BangCap = BangCap;
        this.maTruongPhong = maTruongPhong;
    }

    public String getBangCap() {
        return BangCap;
    }

    public void setBangCap(String bangCap) {
        BangCap = bangCap;
    }

    public String getMaTruongPhong() {
        return maTruongPhong;
    }

    public void setMaTruongPhong(String maTruongPhong) {
        this.maTruongPhong = maTruongPhong;
    }
}
