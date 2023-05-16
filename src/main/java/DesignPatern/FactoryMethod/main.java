package DesignPatern.FactoryMethod;

public class main {
    public static void main(String[] args) {
        bank mb = bankFactory.name("MBbank");

        System.out.println(mb.name());
        mb.payment();
    }
}
