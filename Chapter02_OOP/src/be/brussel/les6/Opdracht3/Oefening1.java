package be.brussel.les6.Opdracht3;

import java.util.Scanner;

public class Oefening1 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String usernaam;
        int index = 2; //De gebruiker kan 3 keer proberen met deze while lus.

        System.out.println("Hallo! Je hebt de optie gekozen om je usernaam te veranderen.");
        System.out.print("Je kan je nieuwe usernaam invoeren : ");
        usernaam = myScanner.nextLine();
        //De gebruiker kan 3 keer proberen met deze while lus.
        while(usernaam.toUpperCase().contains("GORI") || usernaam.toUpperCase().contains("HARAMBE")){ //Gori is contained in gorilla
            // dus kan ik allen "gori" controleren
            System.out.println("Het is niet een goed usernaam voor mij! ");
            System.out.println("Je hebt nog " + index + " poging(en)! Je moet opnieuw proberen : "); //de index is gebruikt in het bericht om de countdown te verwittigen.
            usernaam = myScanner.nextLine();

            index--;

            // Als de grbruiker drie keer probeert, de gebruiker is verbannen en de programma is uitgeschakeld.
            if (index < 1) {
                System.out.println("Sorry, je bent verbannen. Tot ziens!");
                System.out.println("Ik houd niet van gorillas");
                System.exit(0);
            }
        }
        //Als de gebruiker a good naam invoert, wordt een felicitatie bericht afgedrukt
        System.out.println("Proficiat, heb je je usernaam veranderd. Nu is het : " + usernaam);
    }
}