package be.brussel.les1.Opdracht1;

public class LiftingRobot extends Robot{

    private double maxLiftHeigth;

    public LiftingRobot(double maxLiftHeigth, String unitName){
        this.maxLiftHeigth = maxLiftHeigth;
        super.setUnitName(unitName);
    }

    public void lift(double height){

    }


}
