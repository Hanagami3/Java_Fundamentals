package be.brussel.les3.Oefening;

public class CircleApp {

    public static void main(String[] args) {
        Circle circle = new Circle();

        Circle circle1 = new Circle(4);
        System.out.println("Circle1: ");
        System.out.println("Angle: " + circle1.ANGLES);
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Count: " + circle.getCount());


        Circle circle2 = new Circle(5, 2,4);
        System.out.println();
        System.out.println("Circle2: ");
        System.out.println("Angle: " + circle2.ANGLES);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Position X: " + circle2.getX());
        System.out.println("Position Y: " + circle2.getY());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println("Count: " + circle.getCount());

        Circle circle3 = new Circle(circle2);
        System.out.println();
        System.out.println("Circle3: ");
        System.out.println("Angle: " + circle3.ANGLES);
        System.out.println("Radius: " + circle3.getRadius());
        System.out.println("Position X: " + circle3.getX());
        System.out.println("Position Y: " + circle3.getY());
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());
        System.out.println("Count: " + circle.getCount());

    }
}
