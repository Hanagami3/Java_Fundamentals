package be.brussel.les1;

public class Car2 extends Vehicule2 {

    public Car2() {
        System.out.println("No args constructor Car2");
    }
        Car2(String typeOfVehicule){

            super(typeOfVehicule);
            System.out.println("Car constructor");
        }
    }

