package day_2;

import java.util.Scanner;

import static java.lang.System.in;

public class main {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.ChuVi();
        HinhChuNhat hcn2 = new HinhChuNhat();
        Scanner input = new Scanner(in);
        hcn2.setChieudai(Double.parseDouble(input.nextLine()));
        hcn2.setChieurong(Double.parseDouble(input.nextLine()));
        System.out.println("Chu Vi HCN la: " + hcn2.ChuVi());
        System.out.println("Dien Tich HCN la: " + hcn2.DienTich());


    }
}
