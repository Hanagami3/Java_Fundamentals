package be.intecbrussel.les1.UMLOefening;

public class Circle {

    public static final int ANGLES = 0;
    private static int count = 0;
    private int x;
    private int y;
    private int radius;

    public Circle() {
        this.radius = 1;
        this.x = 1;
        this.y = 1;
        count++;
    }

    public Circle(int radius) {
        this.radius = radius;
        count++;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        count++;
    }

    public Circle(Circle c) {

        this.radius = c.radius;
        this.x = c.x;
        this.y = c.y;
        count++;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getPerimeter() {
        return 2 * (Math.PI * radius);
    }

    public void grow(int z){
        System.out.println("Grow to "+  z + ": Radius = " + radius + " + " + z + " = " + (radius+z));
    }

    public static int getCount() {
        return count;
    }
}
