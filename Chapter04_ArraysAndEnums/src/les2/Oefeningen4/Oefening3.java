package Oefeningen4;

import java.util.Arrays;

public class Oefening3 {
    // Na de correctie in de klas heb ik deze oefening verbeterd.

    public static void main(String[] args) {

        String[] myArray = {"Amsterdam", "Brussel", "Paris", "London", "Paris", "Brussel", "Madrid", "Brussel", "Amsterdam"};
        String strArray;// om "toString" te gebruiken
        int j = 0;

        //Ik sorteer de array en ik druk af
        Arrays.sort(myArray);
        strArray = Arrays.toString(myArray);
        System.out.println("De array gesorteerd: " + strArray + "\n");


        //for lus om ieder elementen te controleren
        for (int i = 0; i < myArray.length-1; i++)
            //de array is al gesorteerd dus kan ik allen de index i met de index i+1 te vergelijken
            if (myArray[i] == myArray[i+1]) {
                j++;// Als de if is geactiveerd, is een tweede index verhoogt
                System.out.println(myArray[i] + " is een dubbel.");//de dubbel wordt afgedruk
                /*Ik vervang de dubbel door de laatste elementen door de tweede index te gebruiken
                als er meer dan één bubbel in de array zijn.
                */
                    myArray[i] = myArray[myArray.length-j];
            }
        System.out.println();
        /* de laatste elementen zijn niet meer nodig omdat het dubbele zijn dus maak ik een new array, maar ik gebruik de
        index "j" om de goed length te hebben
         */
        String[] newArray = Arrays.copyOf(myArray,myArray.length-j);
        Arrays.sort(newArray);
        strArray = Arrays.toString(newArray);
        System.out.println(strArray);

        /*mijn code controleert niet als de laatste element is een dubbel dus controleer
        als de laatste twee elementen gelijk zijn
        */
        if (newArray[newArray.length-1] == newArray[newArray.length-2]) {
            newArray = Arrays.copyOf(newArray, newArray.length - 1);
            strArray = Arrays.toString(newArray);
            System.out.println("De eindresultaat met de laatste control: " + strArray);
        }
    }
}
