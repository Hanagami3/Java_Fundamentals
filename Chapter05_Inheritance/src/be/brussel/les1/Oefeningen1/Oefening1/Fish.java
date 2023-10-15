package Oefeningen1.Oefening1;

public class Fish extends Animal{

    public Fish(){
       super(2,"BLOP");
    }

    private String kindFish = "Goldfish";

    public String getKindFish(){
        return kindFish;
    }

    public void setKindFish(String kindFish){
        this.kindFish = kindFish;
    }

    public void legsNumber(){
        System.out.println("None");
    }



}
