package be.brussel.les4.Oefening3;

public class Oefening2 {

    public static void main(String[] args) {

        //variable declaration
        int input = -1;
        String pos = "positief";
        String neg = "negatief";

        //if input is greater or equal than 1 : this is positive
        if(input >= 1)
            System.out.println("De getal is " + pos);
        //if input is smaller or equal than 1 : this is positve
        else if (input <= -1)
            System.out.println("De getal is " + neg);
        //else input is gelijk aan nul.
        else
            System.out.println(("Nul is een positief en negatief getal"));

    }
}
