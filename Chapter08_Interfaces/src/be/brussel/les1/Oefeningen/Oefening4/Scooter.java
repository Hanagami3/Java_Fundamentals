package be.brussel.les1.Oefeningen.Oefening4;

public class Scooter implements Battery{

    private final int batteryPower;
    public Scooter (){
        System.out.println("Car : ");
        this.batteryPower = 50;
    }

    public Scooter (int batteryPower){
        System.out.print("Car : ");
        this.batteryPower = batteryPower;
    }
    @Override
    public int deliverPower() {
        if (batteryPower < 0)
            return 0;
        else if (batteryPower > 50)
            return 50;
        else
            return batteryPower;
    }
}
