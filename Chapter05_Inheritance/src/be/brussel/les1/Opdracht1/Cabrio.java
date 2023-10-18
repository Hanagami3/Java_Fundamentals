package be.brussel.les1.Opdracht1;

public class Cabrio extends Car{

    private boolean sunroof = true;

    public Cabrio(){
        super("yellow", 200);
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void openRoof(){
        System.out.println("Do you want open de Roof?");
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "sunroof=" + sunroof +
                '}';
    }
}