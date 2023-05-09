package day_3.DaHinh.bt1;

public class cirlce {
    private double radius = 1.0;
    private String color = "red";

    public cirlce() {
    }

    public cirlce(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public cirlce(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        if(radius <= 0){
            throw new RuntimeException("Ban Kinh Phai Duong");
        }
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Ban Kinh Phai Duong");
        }
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "cirlce[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Area='" + getArea() +
                ']';
    }
}
