package day_3.bt_2;

public class main {
    public static void main(String[] args) {
        shape[] shapes = new shape[5];
        shapes[0] = new circle("white", true, 6);
        shapes[1] = new circle("red", true, 2);
        shapes[2] = new rectanggle("blue", true, 5,6);
        shapes[3] = new square("brown", true,5);
        shapes[4] = new square("pink", true,10);
        for (shape shape : shapes){
            System.out.println(shape.toString());
        }

        System.out.println(shapes[2].getColor());


        circle c1 = new circle("red", true,2);
        System.out.println(c1.getRadius());
    }
}
