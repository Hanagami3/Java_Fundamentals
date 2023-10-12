package be.brussel.les1;

public class Vehicule {

    public Vehicule() {
        System.out.println("Vehicule class constructor");
    }

    private String typeOfVehicule = "Car";

    public String getTypeOfVehicule() {
        return typeOfVehicule;
    }

    public void setTypeOfVehicule(String typeOfVehicule) {
        this.typeOfVehicule = typeOfVehicule;
    }

    public void honk() {
        System.out.println("barking");
    }

}
