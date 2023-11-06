package be.brussel.Oefeningen.Oefening3;

public class Car implements Switch1, Motor {

    //private final int doors = Vehicle.doors;

    private int closeDoor;
    private boolean onOff;
    private static int count = 0 ;

    public Car(boolean onOff){
        count++;
        System.out.println("Car n°" + count);
        this.onOff = onOff;
        this.closeDoor = 5;
    }

    public Car (int openDoor, int closeDoor){
        count++;
        System.out.println("Car n°" + count);
        this.onOff = true;
        closeDoor(closeDoor);
        openDoor(openDoor);

    }

    @Override
    public void gas() {
        if (onOff && closeDoor == 5)
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

        if (door + closeDoor > doors || door + closeDoor < door)
            System.out.println("Deze auto moet maar 5 deuren hebben.");
        else if (closeDoor < 5)
            System.out.println("gelief de " + (doors-closeDoor) + " geopend deur(en) sluiten.");
    }

    @Override
    public void closeDoor(int door) {
        closeDoor = door;
            if (closeDoor == 5) {
                //onOff = true;
                gas();
            }
    }
}
