package day_2.kethua;

public class IT extends NhanVIen{
    private String MoTaCongViec;

    public IT(String maNhanVien, String tenNhanVien) {
        super(maNhanVien, tenNhanVien);
    }

    public IT(String maNhanVien, String tenNhanVien, String ngaySinh, boolean gioiTinh, String luong, String MoTaCongViec) {
        super(maNhanVien, tenNhanVien, ngaySinh, gioiTinh, luong);
        this.MoTaCongViec = MoTaCongViec;
    }

    public String getMoTaCongViec() {
        return MoTaCongViec;
    }

    public void setMoTaCongViec(String moTaCongViec) {
        MoTaCongViec = moTaCongViec;
    }
}
