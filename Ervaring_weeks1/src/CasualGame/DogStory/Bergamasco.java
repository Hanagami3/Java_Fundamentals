package CasualGame.DogStory;

public class Bergamasco extends HomelyDog{

    private int maxRunningSpeed;
    private double hairLength;

    public Bergamasco(){
        super("Bergamasco", 11, 'L', 'L');
        this.maxRunningSpeed = 10;
        this.hairLength = 56.6;
    }

    public Bergamasco(String name){
        super.setName(name);
        super.setLifeSpan(11);
        super.setSize('L');
        super.setCoat('L');
        this.maxRunningSpeed = 10;
        this.hairLength = 56.6;
    }

    public int getMaxRunningSpeed() {
        return maxRunningSpeed;
    }

    public void setMaxRunningSpeed(int maxRunningSpeed) {
        this.maxRunningSpeed = maxRunningSpeed;
    }

    public double getHairLength() {
        return hairLength;
    }

    public void setHairLength(double hairLength) {
        this.hairLength = hairLength;
    }

    public void kiss(){
        System.out.println("Je houdt van deze hond en je loopt om een kus te geven");
    }
}
