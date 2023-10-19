package be.brussel.les1.Oefening3;

public class Rectangle extends Shapes {

    public Rectangle(){
        super(2,4);
    }

    public Rectangle(int length, int width){
        super.setSide1(length);
        super.setSide2(width);
    }

    @Override
    public int getArea(int side1, int side2) {
        return super.getArea(side1, side2);
    }

    @Override
    public int getPerimeter(int side1, int side2) {
        return super.getPerimeter(side1, side2);
    }
}
