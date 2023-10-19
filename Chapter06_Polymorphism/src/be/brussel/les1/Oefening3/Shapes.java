package be.brussel.les1.Oefening3;

public class Shapes {

    private int side1;
    private int side2;
    private int side3;
    private double radius;

    public Shapes(){
        this.side1 = 1;
        this.side2 = 2;
        this.side3 = 3;
        this.radius = 4.0;
    }

    public Shapes(int side1){
        this.side1 = side1;
    }

    public Shapes(double radius){
        this.radius = radius;
    }

    public Shapes(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public Shapes(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Square
    public int getArea(int side1){
        return side1 * side1;
    }

    //Circle
    public double getArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    //Rectangle and Triangle
    public int getArea(int side1, int side2){
        return (side1 + side2)*2;
    }

    // Square
    public int getPerimeter(int side1){
        return side1*4;
    }

    //Circle
    public double getPerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    //Rectangle
    public int getPerimeter(int side1, int side2){
        return side1 + side2;
    }

    //Triangle
    public int getPerimeter(int side1, int side2, int side3 ){
        return side1 + side2 + side3;
    }

}
