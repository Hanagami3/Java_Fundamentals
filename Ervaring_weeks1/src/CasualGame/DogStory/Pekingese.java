package CasualGame.DogStory;

public class Pekingese extends HomelyDog{

    private double hairLength;

    public Pekingese() {
        super("Pekingese", 10, 'S', 'L');
        this.hairLength = 20.5;
    }

    public Pekingese(String name){
        super.setName(name);
        super.setLifeSpan(12);
        super.setSize('S');
        super.setCoat('L');
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
            System.out.println("de hond komt naar je om te spelen");
        else
            System.out.println("De hond kijkt je niet aan");
    }
}
