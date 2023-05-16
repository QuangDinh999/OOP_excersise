package DesignPatern.FactoryMethod;

public class TPbank implements bank{

    private String privatekey;

    public TPbank(String privatekey) {
        this.privatekey = privatekey;
    }

    @Override
    public String name() {
        return "TPbank";
    }

    @Override
    public void payment() {
        System.out.println("Phuong thuc thanh toan cua TPbank");
    }
}
