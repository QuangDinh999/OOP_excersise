package DesignPatern.Builder;

public class main {
    public static void main(String[] args) {
        order o1 = new order.builder()
                .setTraDa(2)
                .setChao(4)
                .setBanhMi(2)
                .create();
        System.out.println("------------------------------Order ----------------------------------------");
        System.out.println(o1);
        System.out.println("---------------------------- end --------------------------------------------");
    }
}
