package Opdracht1;

public class ElectricCar extends Car{

    private int battery = 60;

    public ElectricCar(){
        super("groen");

    }
    public int getBattery() {
        return battery;
    }

    public void accelerate(int amount) {
        System.out.println("Accelerate: " + (amount + (battery/100)));
    }

    @Override
    public void slow(int amount) {
        System.out.println("Slow: " + (amount - (battery/100)));
    }

    @Override
    public void park() {
        super.park();
    }

    public void charge (int amount){
        System.out.println("Battery: " + amount + "%");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "battery=" + battery +
                '}';
    }
}
