package be.brussel.les1;

public class CarApp {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("This vehicule is an: "+ myCar.getTypeOfVehicule() + "\nThe brand is: " + myCar.getBrandName());

        myCar.sound();

        myCar.honk();
    }
}
