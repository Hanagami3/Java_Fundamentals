package OpdrachtDog;

public class Pekingese extends HomelyDog{

    private double hairLength;

    public Pekingese() {
        super("Sun", 10);
        this.hairLength = 20.5;
    }

    public Pekingese(String name, int lifeSpan){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.hairLength = 20.5;
    }
    public double getHairLength() {
        return hairLength;
    }

    public void setHairLength(double hairLength) {
        this.hairLength = hairLength;
    }

    public void play(boolean funnyFace){
        if (funnyFace)
            System.out.println("the dog comes to you to play");
        else
            System.out.println("The dog don't look at you");
    }
}
