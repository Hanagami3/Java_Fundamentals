package be.brussel.les1.Oefening1;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

    Scanner myScanner = new Scanner(System.in);
    Random myRandom = new Random();

    //Oefening 1
    public int getsmallestnumber(int nb1, int nb2, int nb3){
        int kleinNummer;
        kleinNummer = Math.min(nb1,nb2); //eerst een verkelijging tussen de eerste twee parameters
        if (kleinNummer > nb3)//tweede de deerde parameter is vergeleken aan het kleinste nummer van de eerste stap
            return nb3;
        else
            return kleinNummer;
    }

    // Oefening 2
    public boolean getevennumber(int nb1){

        boolean eenCijferEvenOfNee = true;

        //Transformatie van een int naar een Integer dan naar een String
        Integer NbInt = nb1;
        String nbStr = NbInt.toString();

        char evennumber;
        /*Elke char van de String is een voor een gecontroleerd.
        Als een "cijfer" is oneven, retourneeed de boolean false, anders blijft de boolean true
         */
        for (int i = 0; i < nbStr.length(); i++){
            evennumber = nbStr.charAt(i);
            if (evennumber == '1' || evennumber == '3' || evennumber == '5' || evennumber == '7' || evennumber == '9')
                eenCijferEvenOfNee = false;
        }
        return  eenCijferEvenOfNee;
    }

    /*Oefening 3
    Ik gebruik void want het is duidelijker in de switch-statement als we allen willen afdrukken.
    behalve de "getQuotientNumber", elke keer :  een variabele toewijzen
    dan de berekening met de juiste operatie
    dan de berekening afdrukken
     */
    public int getSumNumber(int nb1, int nb2){

        return nb1 + nb2;

    }

    public int getDifferenceNumber(int nb1, int nb2){

        return nb1 - nb2;

    }

    public int getProductNumber(int nb1, int nb2){

       return nb1 * nb2;
    }

    public void getQuotientNumber(int nb1, int nb2){

        /* je wilde een resultaat met een komma als het nodig was (als modulus != 0)
        Maar ook dat als de resultaat een geheel getal was, wilde ik print geen komma (zoals "8.0")
        Misschien bestaat er een efficiëntere  manier.
         */
        double result;
        result = (double) nb1 / nb2;
        if (nb1 % nb2 == 0) {
            int resultInt = (int) result;
            System.out.println(nb1 + " / " + nb2 + " = " + resultInt);
        }
        else
            System.out.println(nb1 + " / " + nb2 + " = " + result);
    }

    public int getModulusNumber(int nb1, int nb2){

        return nb1 % nb2;

    }

    //Extra methodes

    /*Openingsbericht met de namen van de drie oefeningen.
    De gebruiker kan een oefening kiezen of alle oefeningen
     */
    public char getOefening(){
        char oefening;
        System.out.println("Welkom in die programma! 3 oefeningen zijn beschikbaar : ");
        System.out.println("1. Het kleinste nummer vinden");
        System.out.println("2. Is alle cijfers van een nummer zijn even?");
        System.out.println("3. De eenvoudige rekenmachine");
        System.out.println();
        System.out.println("Welke oefening wil je doen?");
        System.out.print("1 / 2 / 3 (andere invoer = alle oefeningen) : ");
        oefening = myScanner.next().charAt(0);
        System.out.println();
        /*Een andere invoer dan 1, 2 of drie geeft aan de variabele de waarde 'A'.
        Dat geeft een toegang aan alle oefinongen op rij.
         */
        if (oefening != '1' && oefening != '2' && oefening != '3')
            oefening = 'A';
        return oefening;
    }
    /*Vraag voor elke oefening als de gebruiker zichzelf de nummers wil kiezen of niet
    als de invoer "Y" of "y", zijn de nummers willekeurig gekozen
    als een ander char ingevoerd is, kan de gebruiken de nummer kiezen
     */
    public boolean getRandomlyOfNo(){
        boolean willekeurig = false;
        char antwoord;
        System.out.println("Wil je liever de nummers kiezen of wil je liever de programma laten kiezen? ");
        System.out.print("willekeurig? Y (andere invoer is gelijk aan 'N') : ");
        antwoord = myScanner.next().charAt(0);
        if (antwoord == 'y' || antwoord == 'Y')
            willekeurig = true;
        return willekeurig;
    }

    //Roep een willekeurig nummer. De parameter is om de willekeurige limiet in te stellen
    public int getNumberRandomly(int x){
        int nb;
        nb = myRandom.nextInt(1, x);
        return nb;
    }

    /*Roep de gebruiker aan om een getal in te voeren.
    De methode controleert als het getal wel een int is.
     */
    public int getInvoerNummer() {
        int nummer;
        System.out.print("voer een nummer in : ");
        while (!myScanner.hasNextInt()){
            System.out.println("Voer een geheel getal in!");
            myScanner.next();
        }
        nummer = myScanner.nextInt();
        return nummer;
    }

    /*Roep de gebruiker aan om een operatie te kiezen.
    Als de invoer niet een van de vijf eenvoudige operaties, druk het programma de vijf berekeningen mogelijk op rij.
     */
    public char getoperation(){

        char operation;
        System.out.println("Welke operation wil je gebruiken? ");
        System.out.print("+ | - | * | / | % (andere invoer = alle operaties) : ");
        operation = myScanner.next().charAt(0);
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/' && operation != '%')
            operation = 'A';
        return operation;
    }
}

