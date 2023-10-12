package Exercice;

import java.util.Scanner;
import java.util.Random;

public class SpelRaden {

    public static void main(String[] args) {

        Scanner keyboerdReader = new Scanner (System.in);
        Random aleatoire = new Random();

        int numIngevoerd = 1;
        int numRaadsel = aleatoire.nextInt(100);;
        int attempts = 1 ;

        System.out.println("Welcome! You have 10 attempts to find the number to guess (between 0 and 100)" );

        do{
            System.out.println("Tentative " + attempts + ")");
            if (attempts == 5)
                System.out.println("Attention!! Last attempt!");
            System.out.print("Enter a number: ");
            numIngevoerd = keyboerdReader.nextInt();

             if(numIngevoerd > numRaadsel)
                 System.out.println("Too big");
             else if (numIngevoerd < numRaadsel)
                 System.out.println(("Too small"));

            attempts++;
        }while(numIngevoerd != numRaadsel && attempts <= (5));

        if(numIngevoerd != numRaadsel)
            System.out.println("Jammer! The 10 attempts were used");
        else
            System.out.println("Bravo! the number to guess was well " + numIngevoerd);
    }
}
