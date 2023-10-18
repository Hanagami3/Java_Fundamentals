package OpdrachtDog;

public class Wolf {

    private String name;
    private int lifeSpan;

    public Wolf(){
        this.name = "White Fang";
        this.lifeSpan = 16;
    }

    public Wolf(String name, int lifeSpan){
        this.name = name;
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void makeNoise(){
        System.out.println("Auuuuuuuuwwwww");
    }

    public void makeNoise(String noise){
        System.out.println(noise);
    }
}
