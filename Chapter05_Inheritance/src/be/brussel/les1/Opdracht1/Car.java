package Opdracht1;

public class Car {

    private String color = "White";
    private int speed = 50;
    private int hp;

    public Car() {

    }

    public Car (String color){
        this.color = color;
    }

    public Car (String color, int hp){
        this.color = color;
        this.hp = hp;
    }

    public Car (String Color, int speed, int hp){
        this.color = color;
        this.speed = speed;
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
