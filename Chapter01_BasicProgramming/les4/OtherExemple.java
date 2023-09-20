package be.brussel.les4;

import java.util.Scanner;

public class OtherExemple {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner (System.in);
        System.out.println("vérication du palindrome : ");
        StringBuilder mot = new StringBuilder(keyboardReader.nextLine());
        StringBuilder motInv = new StringBuilder(mot.reverse());
        System.out.println(mot);
        System.out.println(motInv);
        boolean ok;
        System.out.println(ok = (mot.equals(motInv)));

        if(mot.equals(motInv))
            System.out.println(mot + " est une palindrome");
        else
            System.out.println(mot + " n'est ps un palindrome");

    }
}
