package be.brussel.les1.Oefening3;

public class Circle extends Shapes {


    public Circle(){
        super(2.5);
    }

    public Circle(double radius){
        super.setRadius(radius);
    }

    @Override
    public double getArea(double radius) {
        return super.getArea(radius);
    }

    @Override
    public double getPerimeter(double radius) {
        return super.getPerimeter(radius);
    }
}
