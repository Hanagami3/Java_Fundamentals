package Opdracht1;

public class SUV extends Car{

    private boolean bullbar;
    private boolean isAWDOn;

    public SUV(){
        super("rood", 30,250);
    }

    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void allWheelDrive(boolean awD){
        this.isAWDOn = awD;
        System.out.println("All the wheels drive: " + isAWDOn);
    }

    @Override
    public void accelerate(int amount) {
        super.accelerate(amount);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "SUV{" +
                "bullbar=" + bullbar +
                ", isAWDOn=" + isAWDOn +
                '}';
    }
}
