package be.brussel.les1;

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

    public void honk(){
        System.out.println("Tuut tuut!");
    }

    public void sound(){
        super.honk();
    }
}
