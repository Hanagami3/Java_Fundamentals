package be.brussel.les1.Oefeningen.Oefening3;

public class Car implements Switch1, Motor {

    private final int doors = Vehicle.doors;

    private int openDoor;
    private int closeDoor;
    private final boolean onOff;
    private static int count = 1 ;
    public Car(){
        System.out.println("Car n°" + count);
        this.onOff = false;
        this.openDoor = 0;
        this.closeDoor = 5;
        count++;
    }

    public Car(boolean onOff){
        System.out.println("Car n°" + count);
        this.onOff = onOff;
        this.openDoor = 0;
        this.closeDoor = 5;
        count++;
    }

    public Car (int openDoor){
        System.out.println("Car n°" + count);
        this.onOff = true;
        this.openDoor = openDoor;
        this.closeDoor = doors - openDoor;
        count++;
    }

    public int getOpenDoor() {
        if (openDoor > 5)
            openDoor = 5;
        return openDoor;
    }

    public int getCloseDoor() {
        if (closeDoor < 0)
            closeDoor = 0;
        return closeDoor;
    }

    @Override
    public void gas() {
        if (onOff && openDoor == 0)
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

    @Override
    public void openDoor(int door) {
        System.out.println("Aantal geopend deuren: " + openDoor);
    }

    @Override
    public void closeDoor(int door) {
        System.out.println("aantal gesloten deuren: " + closeDoor);
    }
}
