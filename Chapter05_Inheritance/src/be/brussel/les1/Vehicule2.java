package be.brussel.les1;

public class Vehicule2 {

    private String typeOfVehicule;

    public Vehicule2() {
        //this("Car2");
        System.out.println("Vehicule class no-args constructor");
    }

    public Vehicule2(String typeOfVehicule) {

        this();
        this.typeOfVehicule = typeOfVehicule;
        System.out.println(("Constructor Vehicule met parameters"));
    }
}
