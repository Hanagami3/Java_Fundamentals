package be.brussel.les1.Oefeningen1.Oefening1;

public class Dog {

    public Dog(){
        super();
        System.out.println("Dog class constructor");
    }

    private String kindDog = "Beagle";

    public String getKindDog() {
        return kindDog;
    }

    public void setKindDog(String kindDog){
        this.kindDog = kindDog;
    }

    public void cry(){
        System.out.println("waf waf");
    }

    public void sound(){
        //super.cry();
    }
}
