package be.brussel.les1.Oefening4;

import be.brussel.les1.Example4.Parent;

public class MainApp {

    public static void main(String[] args) {

        Vehicle vehicle0 = new Vehicle();
        vehicle0.getMessage();

        Vehicle vehicle = new Boat();
        vehicle.getMessage();

        Vehicle vehicle1 = new Plane();
        Plane plane = (Plane) vehicle1;
        plane.getMessage();

        Truck truck = new Truck();
        truck.getMessage();


    }
}
