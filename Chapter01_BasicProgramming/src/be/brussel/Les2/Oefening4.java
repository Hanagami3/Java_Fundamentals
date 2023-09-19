package be.brussel.Les2;

import java.util.Scanner;

public class Oefening4 {

    public static void main(String[] args) {

        String naam, adres, telnum;

        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("Naam ?");
        naam = keyboardReader.nextLine();
        System.out.println("Adres ?");
        adres = keyboardReader.nextLine();
        System.out.println("Telefoonnummer ?");
        telnum = keyboardReader.nextLine();

        System.out.println(naam);
        System.out.println(adres);
        System.out.println(telnum);

    }
}
