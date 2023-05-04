package OOP.CircleClass;

public class CircleClass_main {
    public static void main(String[] args) {
        // Test Constructors and toString()
        CircleClass c1 = new CircleClass(1.1);
        System.out.println(c1);   // toString()
        CircleClass c2 = new CircleClass(); // default constructor
        System.out.println(c2);

        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);      // toString()
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
