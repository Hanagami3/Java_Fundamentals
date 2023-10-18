package OpdrachtDog;

public class BelgianMalinois extends WildDog{

    private boolean dangerous;
    private double maxRunningSpeed;

    public BelgianMalinois(){
        super("Rex",13);
        this.dangerous = true;
        this.maxRunningSpeed = 13.33;
    }

    public BelgianMalinois(String name, int lifeSpan){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.dangerous = true;
        this.maxRunningSpeed = 13.33;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public double getMaxRunningSpeed() {
        return maxRunningSpeed;
    }

    public void setMaxRunningSpeed(double maxRunningSpeed) {
        this.maxRunningSpeed = maxRunningSpeed;
    }

    public void defend(boolean food){
        if (food)
            System.out.println("The dog the dog no longer defends the treasure\n" +
                    " The treasur is all yours!!");
        else
            System.out.println("The dog understands you want to steal the treasure\n" +
                    " You've got serious injuries and go to the hospital... It's too bad");
    }

    public void attack(boolean nice){
        if (nice)
            System.out.println("the dog feels that you are a kind person\n" +
                    "you caress the dog and you pass your way");
        else System.out.println("the dog feels that you are a bad person\n" +
                " You've got serious injuries and go to the hospital... It's too bad");
    }
}
