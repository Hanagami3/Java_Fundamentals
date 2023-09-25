package be.brussel.Opdracht1;

import java.util.Scanner;

public class WhileExample5 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int nbInput;

        do{
            System.out.print("Voer een nummer in van 1 tot 10 : ");
            nbInput = myScanner.nextInt();

        }while (nbInput <= 0 || nbInput >= 11);
    }
}
