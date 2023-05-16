package DesignPatern.FactoryMethod;

public class bankFactory {
    private bankFactory(){}
    public static bank name(String bank){
        switch (bank){
            case "TPbank":
                return new TPbank("abc0");
            case "MBbank":
                return new MBbank("ert0");
            default:
                return null;
        }
    }
}
