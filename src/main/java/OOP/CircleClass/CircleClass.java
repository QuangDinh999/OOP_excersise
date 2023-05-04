package OOP.CircleClass;

public class CircleClass {
    private double radius = 1.0;

    public CircleClass() {
    }

    public CircleClass(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "CircleClass[" +
                "radius=" + radius +
                ']';
    }
}
