package day_3.DaHinh.bt1;

public class cylinder extends cirlce {
    private double height = 1.0;

    public cylinder() {
    }

    public cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
