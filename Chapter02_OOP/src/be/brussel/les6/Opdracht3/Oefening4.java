package be.brussel.les6.Opdracht3;

import java.util.Random;
import java.util.Scanner;

public class Oefening4 {

    public static void main(String[] args) {

        Random myRandom = new Random();
        Scanner myScanner = new Scanner(System.in);

        int credit = 17; // Het startkrediet
        int dobblesteen; // Tussen 1 and 20 met Random.nextInt(21)
        int geld = 22; // het startgeld
        char antwoord; // Yes or andere invoer.
        boolean winnen = false;

        //Do lus die controleert als de gebruiker nog minimum 5 euros heeft
        do {
            //Vraag aan de gebruiker of hij 5 euros wilt betalen om 20 kredieten te krijgen als hij minder dan 3 krediten heeft
            if (credit < 3){
                System.out.println();
                System.out.println("Je hebt nog " + geld + " euros");
                System.out.println("wil je 5 euros betalen om 20 kredieten te krijgen?");
                System.out.println("'Y' om verder te gaan (een andere sleutel om het programma te verlaten :");
                antwoord = myScanner.next().charAt(0);
                if (antwoord == 'Y' || antwoord == 'y') {
                    credit += 20;
                    geld -= 5;
                }
                else // Als de gebruiker niet de 'Y' invoert, verlaat hij deze lus en gaat hij op het einde van het programma.
                    break;
            }
            //Zolang dat we nog minimum 3 kredieten hebben, werkt deze while-lus.
            while (credit >= 3) {
                credit -= 3;
                dobblesteen = myRandom.nextInt(1, 21);
                System.out.println("dobblesteen : " + dobblesteen + " | credits : " + credit);
                //Als het resultaat van de dobbelsteen 13 is, wordt boolean true en verlaten we deze eerste lus
                if (dobblesteen == 13) {
                    winnen = true;
                    break;
                    // Als het resultaat van de dobbelsteen 7 is, krijgen we 2 extra kredieten
                } else if (dobblesteen == 7) {
                    credit += 2;
                    System.out.println("Gelukkig heb je 2 extra kredieten gekregen");
                }
            }
            //als boolean true is, verlaten we ook deze tweede lus
            if (winnen)
                break;
        }while (geld >= 5);

        //eindresultaat
        if(winnen)
            System.out.println("Proficiaat! Het resultaat van de dobbelsteen is 13! Je hebt gewonnen");
        else
            System.out.println("Spijtig!! Het resultaat van de dobbelsteen is nooit 13 geweest en je heeft niet meer genoeg krediet.");
    }
}
