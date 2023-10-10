package be.brussel.les2;

public class RectangleApp {

    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println("Rectangle1:");
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println(Rectangle.CORNERS);
        System.out.println(Rectangle.count);


        System.out.println();
        Rectangle rectangle2 = new Rectangle(1, -1, 12, 16);
        System.out.println("rectangle2:");
        System.out.println("Position x: " + rectangle2.getX());
        System.out.println("Position y: " + rectangle2.getY());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Width: " + rectangle2.getWidth());

        System.out.println();
        Rectangle rectangle3 = new Rectangle(rectangle);
        System.out.println("rectangle3:" );
        System.out.println("Area :" + rectangle3.getArea());
        System.out.println("Perimeter :" + rectangle3.getPerimeter());
        System.out.println("Position x: " + rectangle3.getX());
        System.out.println("Position y: " + rectangle3.getY());
        System.out.println("Height: " + rectangle3.getHeight());
        System.out.println("Width: " + rectangle3.getWidth());


    }
}
