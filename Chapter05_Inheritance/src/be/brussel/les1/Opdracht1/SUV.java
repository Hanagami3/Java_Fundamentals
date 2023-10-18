package be.brussel.les1.Opdracht1;

public class SUV extends Car{

    private boolean bullbar;
    private boolean isAWDOn;

    public SUV(){
        super("red",250);
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
        if (speed > 30 ) {
            super.setSpeed(30);
            System.out.println("/!\\ Limited speed for the SUV! ");
        }
        else
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