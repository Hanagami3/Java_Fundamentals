package OpdrachtDog;

public class Bergamasco extends HomelyDog{

    private int maxRunningSpeed;
    private double heirLength;

    public Bergamasco(){
        super("Touffu", 11);
        this.maxRunningSpeed = 10;
        this.heirLength = 56.6;
    }

    public Bergamasco(String name, int lifeSpan){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.maxRunningSpeed = 10;
        this.heirLength = 56.6;
    }

    public int getMaxRunningSpeed() {
        return maxRunningSpeed;
    }

    public void setMaxRunningSpeed(int maxRunningSpeed) {
        this.maxRunningSpeed = maxRunningSpeed;
    }

    public double getHeirLength() {
        return heirLength;
    }

    public void setHeirLength(double heirLength) {
        this.heirLength = heirLength;
    }

    public void kiss(){
        System.out.println("You love this dog and you run to give a kiss");
    }
}
