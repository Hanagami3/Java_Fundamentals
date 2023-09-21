package be.brussel.les5.Oefening4;

public class Oefening3 {

    public static void main(String[] args) {

        //initialisation variable
        String naam = "Maxime";
        byte leeftijd = 0;

        do{
            // Body of loop. leeftijd  incremented each time
            System.out.println("Naam: " + naam +", leeftijd: " + leeftijd);
            leeftijd++;
            // Checking condition in the end of the loop.
        }while(leeftijd < 32);

    }
}
