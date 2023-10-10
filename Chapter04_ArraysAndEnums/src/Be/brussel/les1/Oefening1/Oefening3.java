package Be.brussel.les1.Oefening1;

import java.util.Scanner;

public class Oefening3 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int lengthArr;//de toekomstige grootte van de array die bij de gebruiker zal aanvragen
        System.out.print("Hoeveel getallen wil je invoeren: ");
        lengthArr = myScanner.nextInt();

        int[] nummersLijst = new int[lengthArr];

        //Elke index is bij de gebruiker ingevoerd en het programma drukt af als het getaal even of oneven is
        for (int i = 0; i < nummersLijst.length; i++) {
            System.out.println();
            System.out.print("Voer een getal in: ");
            nummersLijst[i] = myScanner.nextInt();

            System.out.print(nummersLijst[i] + " is ");
            if (nummersLijst[i] % 2 == 0)
                System.out.println("even");
            else
                System.out.println("oneven");
        }
        System.out.println();
        System.out.println("Dank u wel en tot straks!!");
    }
}