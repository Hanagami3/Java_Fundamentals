package be.brussel.Oefeningen.Oefening3;

public class MainApp {

    public static void main(String[] args) {

        Car car1 = new Car(0,5);
        Car car2 = new Car(3,2);
        Car car3 = new Car(3,3);

        Car car4 = new Car(true);
        car4.closeDoor(5);
        car4.openDoor(0);
        Car car5 = new Car(false);
        car5.closeDoor(5);
        car5.openDoor(0);

    }
}
