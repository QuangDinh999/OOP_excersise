package day_3.bt_2;

public class square extends rectanggle{
    protected double side = 1.0;
    public square() {
    }

    public square(double side) {
        super(side, side);
    }

    public square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public String toString() {
        return "square[shape[" +
                ", color='" + color + '\'' +
                ", filled=" + filled + "]" +
                ", length=" + side +
                ", width=" + side + ']' +
                ", Area=" + getArea() +
                ", Perimeter" + getPerimeter() +
                ']';
    }
}
