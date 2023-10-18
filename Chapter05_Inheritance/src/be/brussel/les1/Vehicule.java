package be.brussel.les1;

import java.util.Objects;

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
        System.out.println("Toet toet! From the Vehicle class");
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return Objects.equals(typeOfVehicule, vehicule.typeOfVehicule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfVehicule);
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "typeOfVehicule='" + typeOfVehicule + '\'' +
                '}';
    }
}
