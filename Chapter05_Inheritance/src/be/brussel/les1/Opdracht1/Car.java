package be.brussel.les1.Opdracht1;

public class Car {

    private String color = "white";
    private int speed = 0;
    private int hp = 0;

    public Car() {

    }

    public Car (String color){
        this.color = color;
    }

    public Car (String color, int hp){
        this.color = color;
        this.hp = hp;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!(color.equals("red") || color.equals("white") || color.equals("green") || color.equals("yellow"))) {
            this.color = this.color;
            System.out.println( color + ": sorry this color is no longer available");
        }
        else
            this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void accelerate(int amount){
        System.out.println("Accelerate : " + (amount + (hp/100)));
    }

    public void slow (int amount){
        System.out.println("Slow : " + (amount - (hp/100)));
    }

    public void park (){
        System.out.println("Speed = 0");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}