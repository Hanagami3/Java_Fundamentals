package be.brussel.les6.Opdracht3;

import java.util.Random;

public class Oefening3 {

    public static void main(String[] args) {

        Random myrandom = new Random();

        int monsterPunt;
        int experiencePunt = 0;
        boolean winnen = false;

        //je kan max 10 ontmoeting maken dus begint de for lus aan 0 tot 10 en +1 bij elke pass in de lus.
        for(int tegenKomen = 1; tegenKomen <= 10; tegenKomen++){
            monsterPunt = myrandom.nextInt(1,4);// ervaringspunten zijn willekeurig geselecteerd.
            System.out.println();
            System.out.println("Monster n°" + tegenKomen + " met " + monsterPunt + " ervaringpunt(en).");

            //verschillende case afhankelijk van de ervaring van het aangetroffen monster
            switch (monsterPunt){
                case 1 :// je negeer de monster met 1 punt.
                    System.out.println("Je negeert deze monster.");
                    continue;
                    //je neemt de punten van de monster met 2 of 3 punten
                case 2:
                    experiencePunt +=2;
                    break;
                case 3:
                    experiencePunt +=3;
                    break;
            }
            System.out.println("Nu je ervaringpunten is : " + experiencePunt);
            //Als je 15 punten, kan je stoppen en je "wint"
            if (experiencePunt >= 15){
                winnen = true;// boolean voor het einde van het programma
                break;//je verlaat de lus.
            }
        }
        System.out.println();
        if (winnen)
            System.out.println("Proficiat!! Je hebt een niveau verdient");
        else
            System.out.println("Sorry! Je hebt 10 monsters tegengekomen. Het is genoeg. ");
    }
}
