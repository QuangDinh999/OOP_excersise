package day_3.bt_1;

public abstract class mammal extends animal {

    public mammal() {
    }

    public mammal(String name) {
        super(name);
    }

    public abstract void greet();

    @Override
    public String toString() {
        return "mammal{}";
    }
}
