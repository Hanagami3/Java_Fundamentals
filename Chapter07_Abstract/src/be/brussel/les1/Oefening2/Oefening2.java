package be.brussel.les1.Oefening2;

public class Oefening2 {

    static final double DIAMETER_SUN = 1392700.0;
    static final double DIAMETER_EARTH = 12742.0;
    static final double DIAMETER_MOON = 3474.8;

    final static double getOmtrek(double diameter){
        return diameter * Math.PI;
    }

    public static void main(String[] args) {

        System.out.println("De Omtrek van de zon is " + Math.round(getOmtrek(DIAMETER_SUN)) + " Km");
        System.out.println("De Omtrek van de aarde is " + Math.round(getOmtrek(DIAMETER_EARTH)) + " Km");
        System.out.println("De Omtrek van de maan is " + Math.round(getOmtrek(DIAMETER_MOON)) + " Km");;
    }
}
