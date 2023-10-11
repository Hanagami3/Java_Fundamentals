package Oefeningen4;

import java.util.Arrays;
import java.util.Random;

public class Oefening1 {

    public static void main(String[] args) {

        Random myRandom = new Random();

        double[] doubleArr = new double[myRandom.nextInt(15, 30)];//de grootte van de Arrays wordt willekeurig gekozen
        String[] strArr = {"ik", "ben", "niet", "zeker", "of", "ik", "de", "oefening","3", "wel", "doen", "maar", "ik", "zal", "het", "probeer"};

        //de elementen worden één voor één toegevoegd en willekeurig door een lus voor
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = myRandom.nextDouble(1, 100);
            System.out.print(Math.floor(doubleArr[i]) + " ");
        }
        System.out.println();
        //de array wordt in de andersom volgorde afgedrukt
        Arrays.sort(doubleArr);
        for (int i = doubleArr.length-1; i >= 0; i-- )//-1 want de length is een langer dan de index.
            System.out.print(Math.floor(doubleArr[i]) + " ");

        System.out.println();
        System.out.println();
        // dezelfde manieren voor de string array
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
            System.out.print(" ");
        }
        System.out.println();
        Arrays.sort(strArr);
        for (int i = strArr.length-1; i >= 0; i-- ) {
            System.out.print(strArr[i]);
            System.out.print(" ");
        }
    }
}
