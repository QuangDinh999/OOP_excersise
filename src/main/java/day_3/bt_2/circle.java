package day_3.bt_2;

public class circle extends shape{
    protected double radius = 1.0;

    public circle(){}
    public circle(double radius) {
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Ban Kinh Phai Duong");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "circle[shape[" +
                "color='" + color + '\'' +
                ",filled=" + filled + "]" +
                "radius=" + radius + ']' +
                ", Area=" + getArea() +
                ", Perimeter" + getPerimeter() +
                ']';
    }
}
