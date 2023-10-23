package be.brussel.les1.Opdracht1;

public class BendingRobot extends Robot{

    private double maxBendAngle;

    public BendingRobot(double maxBendAngle, String unitName){
        this.maxBendAngle = maxBendAngle;
        super.setUnitName(unitName);
    }

    public void bend(double angle){

    }
}
