package day_3.bt_2;

public class rectanggle extends shape {
    protected double length =1.0;
    protected double width = 1.0;

    public rectanggle(){}

    public rectanggle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public rectanggle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length + width)*2;
    }

    @Override
    public String toString() {
        return "rectanggle[shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled + "]" +
                ", length=" + length +
                ", width=" + width + "]" +
                ", Area=" + getArea() +
                ", Perimeter" + getPerimeter() +
                ']';
    }
}
