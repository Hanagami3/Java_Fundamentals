package be.brussel.les1;

public class CarApp {

    public static void main(String[] args) {

        Vehicule myVehicule = new Vehicule();
        myVehicule.honk();

        System.out.println("-----------------separator----------------");
        Car myCar = new Car();
        myCar.honk();
        System.out.println("This vehicule is an: "+ myCar.getTypeOfVehicule() + "\nThe brand is: " + myCar.getBrandName());


    }
}
