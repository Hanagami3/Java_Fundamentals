package be.brussel.les1;

import java.util.Objects;

public class Car extends Vehicule{

    public Car(){
        super();
        System.out.println("Car class constructor");

    }

    private String brandName = "Audi";

    public String getBrandName(){
        return brandName;
    }

    private void setBrandName(String brandName){
        this.brandName = brandName;
    }

    @Override
    public void honk() {
        super.honk();
        System.out.println("Tuut tuut! From Car class");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brandName, car.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
