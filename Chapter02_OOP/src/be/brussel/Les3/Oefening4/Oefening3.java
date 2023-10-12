package be.brussel.Les3.Oefening4;

import java.util.Scanner;

public class Oefening3 {

    public static void main(String[] args) {

        double nbRanD = 0;

        Scanner myScaner = new Scanner(System.in);
        System.out.println("Welcome! How many numbers do you want to see?");
        int loop = myScaner.nextInt();

        //loop the number entered by the user
        for (int i = 0; i < loop; i++) {
            nbRanD = Math.random()*60.;
            int nbRanI = (int) Math.ceil(nbRanD);
            //checks if it is a even number
            if (nbRanI % 2 == 0)
                System.out.println(nbRanI + " is even");
            else
                System.out.println(nbRanI + " is oneven");
        }
        System.out.println("Thank you en goodbye");
    }

}
