package day_1;

import java.util.Scanner;

import static java.lang.System.in;

public class main {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        System.out.println("Chu VIi HCN la: " + hcn1.ChuVi());
        HinhChuNhat hc2 = new HinhChuNhat(4,5);
        System.out.println("Dien Tich HCN la:" + hc2.DienTich());

        HinhTron ht1 = new HinhTron();
        System.out.println("Chu vi: "+ ht1.ChuVi());
        HinhTron ht2 = new HinhTron();
        System.out.println("Dien Tich: " + ht2.DienTich());
        HinhTron arr[] = new HinhTron[5];
        Scanner input = new Scanner(in);
        for(int i = 1; i < 5; i++){
            System.out.printf("r['%d]=", i);
            double r = Double.parseDouble(input.nextLine());
        }

    }
}
