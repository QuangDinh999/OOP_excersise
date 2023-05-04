package day_2.kethua;

public class main_2 {
    public static void main(String[] args) {
        KeToan kt1 = new KeToan("KT1","Nguyen Van A");
        System.out.println(kt1);

        IT it1 = new IT("IT1","Nguyen Van B");
        System.out.println(it1);

        NhanVIen nv[] = new NhanVIen[3];
        nv[0] = kt1;
        nv[1] = it1;
        nv[2] = new IT("IT3","Nguyen Van C");

        for (int i = 0; i < nv.length; i++){
            System.out.println(nv[i].toString());
        }
    }
}
