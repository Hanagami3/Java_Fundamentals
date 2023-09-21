package be.brussel.les6.Oefening5;

public class Oefening1 {

    public static void main(String[] args) {

        int number01 = 253;
        long number02 = 2365L;

        // Automatische casting
        double myDouble01 = number01;
        double myDouble02 = number02;

        //Normal print => comma-less print
        System.out.println(myDouble01 + " => " + Math.round(myDouble01));
        System.out.println(myDouble02 + " => " + Math.round(myDouble02));

    }
}
