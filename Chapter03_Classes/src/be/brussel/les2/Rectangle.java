package be.brussel.les2;


public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;
    public static final int CORNERS=4;
    public static int count = 0;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle r){
        this.height = r.height;
        this.width = r.width;
        this.x = r.x;
        this.y = r.y;
    }

    public Rectangle() {
        this(1,1);
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
         this.width = width < 0 ? - width : width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : width;
    }

    public double getArea(){
        return height*width;
    }

    public  double getPerimeter(){
        return 2*(width+height);
    }

    public void grow(int d){
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }
}
