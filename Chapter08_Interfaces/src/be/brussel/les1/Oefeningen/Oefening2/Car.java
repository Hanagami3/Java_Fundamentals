package be.brussel.les1.Oefeningen.Oefening2;

public class Car implements Switch1, Motor{

    private final boolean onOff;
    private static int count = 1 ;
    public Car(){
        System.out.println("Car n°" + count);
        this.onOff = false;
        count++;
    }

    public Car(boolean onOff){
        System.out.println("Car n°" + count);
        this.onOff = onOff;
        count++;
    }
    @Override
    public void gas() {
        if (onOff)
            System.out.println("De wagen staat aan. Je kan gas geven.");
        else
            System.out.println("De wagen staat niet aan.");
    }

    @Override
    public void toggleSwitch() {
        System.out.print("De switch: ");
        if (onOff)
            System.out.println("ON!");
        else
            System.out.println("OFF");
    }
}
