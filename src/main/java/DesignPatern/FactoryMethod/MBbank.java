package DesignPatern.FactoryMethod;

public class MBbank implements bank{
    private String privatekey;

    public MBbank(String privatekey) {
        this.privatekey = privatekey;
    }

    @Override
    public String name() {
        return "MBbank";
    }

    @Override
    public void payment() {
        System.out.println("Phuong thuc thanh toan cua MBbank");
    }
}
