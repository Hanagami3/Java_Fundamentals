package be.brussel.les1.Oefeningen.Oefening4;

public class MainApp {

    public static void main(String[] args) {

        Battery car = new Car(75);
        System.out.println("the battery power is of " + car.deliverPower() + " %.");

        Battery bicycle = new Bicycle(53);
        System.out.println("the battery power is of " + bicycle.deliverPower() + " %.");

        Battery scooter = new Scooter(-1);
        System.out.println("the battery power is of " + scooter.deliverPower() + " %.");
    }
}
