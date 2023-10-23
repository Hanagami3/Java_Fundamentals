package be.brussel.les1.Opdracht1;

public class Robot {

    private String unitName;

    public Robot(){
        this.unitName = "nameless Robot";
    }

    public Robot(String unitName){
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void boot(){
        System.out.println("De robot démarre");
    }
}
