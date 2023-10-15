package Oefeningen1.Oefening1;

public class Dog extends Animal {
    public Dog(){
        super(4,2, "WAF WAF");
    }

    private String kindDog = "Beagle";

    public String getKindDog() {
        return kindDog;
    }

    public void setKindDog(String kindDog){
        this.kindDog = kindDog;
    }

}
