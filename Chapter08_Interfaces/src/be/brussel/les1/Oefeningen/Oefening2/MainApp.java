package be.brussel.les1.Oefeningen.Oefening2;

public class MainApp {

    public static void main(String[] args) {

        Car car = new Car();
        car.toggleSwitch();
        car.gas();

        System.out.println();
        Car auto = new Car(true);
        auto.toggleSwitch();
        auto.gas();
    }
}
