package be.brussel.Oefeningen.Oefening4;

public class Bicycle implements Battery{

    private final int batteryPower;
    public Bicycle (){
        System.out.println("Car : ");
        this.batteryPower = 50;
    }

    public Bicycle (int batteryPower){
        System.out.print("Car : ");
        this.batteryPower = batteryPower;
    }
    @Override
    public int deliverPower() {
        if (batteryPower < 0)
            return 0;
        else if (batteryPower > 25)
            return 25;
        else
            return batteryPower;
    }
}
