package be.brussel.les1.Oefening3;

public class MainApp {

    public static void main(String[] args) {


        Shapes circle1 = new Circle();
        System.out.println(circle1.getArea(2.3));
        System.out.println(circle1.getPerimeter(circle1.getRadius()));

        Shapes circle2 = new Circle(4);
        System.out.println(circle2.getArea(2.0));
        System.out.println(circle2.getPerimeter(circle2.getRadius()));

        Circle circle3 = new Circle(4);
        System.out.println(circle3.getArea(2.0));
        System.out.println(circle3.getPerimeter(circle3.getRadius()));

    }

}
