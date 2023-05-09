package day_3.truutuong;

public class animal {
    private String name;

    public animal(){}
    public animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "animal[" +
                "name='" + name + '\'' +
                ']';
    }
}
