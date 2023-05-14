package Day_4.singleton;

public class TongThong {
    private String hoTen;
    private static TongThong instance = null;

    private TongThong(String hoTen) {
        this.hoTen = hoTen;
    }

    public static TongThong getInstance() {
        if (instance == null) {
            instance = new TongThong("donald trump");
        }
        return instance;
    }

    public void KySacLenh() {
        System.out.println("Tong thong " + hoTen + " ky sac lenh");
    }


}