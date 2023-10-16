package be.brussel.les3.Oefening;

public class Circle {

    public static final int ANGLES = 0;
    private int count = 0;
    private int x;
    private int y;
    private int radius;

    public Circle(){
        this.radius = 1;
        this.x = 1;
        this.y = 1;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(int radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(Circle c){

        this.radius = c.radius;
        this.x = c.x;
        this.y = c.y;
    }


    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*(Math.pow(radius,2));
    }

    public double getPerimeter(){
        return 2*(Math.PI*radius);
    }

    public int getCount() {
        return count+=1;
    }

}
