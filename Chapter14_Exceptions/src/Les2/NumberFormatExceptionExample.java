package Les2;

import java.util.Scanner;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {

        String sLeeftijd;
        int iLeeftijd;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je leeftijd in");
        sLeeftijd = scanner.nextLine();

        try {
            iLeeftijd = Integer.parseInt(sLeeftijd); //kan ook voe Double.parseDouble of Float.parseFloat
            System.out.println("Jouw leeftijd: " + iLeeftijd);
        } catch (NumberFormatException nfe) {
            // de numerieke waarde (number format) klopt niet.

            System.out.println("Err: leeftijd bevat geen numeriek waarde");
        }
    }
}

