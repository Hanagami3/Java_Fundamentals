package Opdracht1;

public class Cabrio extends Car{

    private boolean sunroof = true;

    public Cabrio(){
        super("geel", 200);
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void openRoof(){
        System.out.println("The roof is open");
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "sunroof=" + sunroof +
                '}';
    }
}
