package be.brussel.les1.OpdrachtDog;

public class Wolf {

    private String name;
    private int lifeSpan;

    public Wolf(){
        this.name = "Unknown";
        this.lifeSpan = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("Max"))
            name = "MAX";
        this.name = name;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void makeNoise(){

    }

    public void makeNoise(String noise){

    }
}
