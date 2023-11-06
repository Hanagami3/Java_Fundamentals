package be.brussel.Oefeningen.Oefening4;

public class Car implements  Battery{

    private final int batteryPower;
    public Car (){
        System.out.println("Car : ");
        this.batteryPower = 100;
    }

    public Car (int batteryPower){
        System.out.print("Car : ");
        this.batteryPower = batteryPower;
    }
    @Override
    public int deliverPower() {
        if (batteryPower < 0)
            return 0;
        else if (batteryPower > 100)
            return 100;
        else
            return batteryPower;
    }
}
