package be.brussel.les1.Oefeningen.Oefening3;

public class MainApp {

    public static void main(String[] args) {

        /*Car car = new Car();
        car.toggleSwitch();
        car.gas();

        System.out.println();
        Car car1 = new Car(true);
        car1.toggleSwitch();
        car1.gas();*/

        Car auto1 = new Car(0);
        auto1.openDoor(auto1.getOpenDoor());
        auto1.closeDoor(auto1.getCloseDoor());
        auto1.gas();

        System.out.println();
        Car auto2 = new Car(3);
        auto2.openDoor(auto2.getOpenDoor());
        auto2.closeDoor(auto2.getCloseDoor());
        auto2.gas();
    }
}
