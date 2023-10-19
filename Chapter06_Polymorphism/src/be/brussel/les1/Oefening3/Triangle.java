package be.brussel.les1.Oefening3;

public class Triangle extends Shapes{

    public Triangle(){
        super(2,3,5);
    }

    public Triangle(int base, int height){
        super.setSide1(base);
        super.setSide2(height);
    }

    public Triangle(int side1, int side2, int side3){
        super.setSide1(side1);
        super.setSide2(side2);
        super.setSide2(side3);
    }

    @Override
    public int getArea(int base, int height) {
        return (base * height) / 2;
    }

    @Override
    public int getPerimeter(int side1, int side2, int side3) {
        return super.getPerimeter(side1, side2, side3);
    }
}
