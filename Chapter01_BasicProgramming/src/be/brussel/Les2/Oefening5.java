package be.brussel.Les2;

import java.util.Scanner;

public class Oefening5 {

    public static void main(String[] args) {

        short nb1, nb2, nb3, nb4, nb5;
        float moyenne;

        Scanner keyboardReader = new Scanner (System.in);

        System.out.print("Enter first number : ");
        nb1 = keyboardReader.nextShort();
        System.out.print("Enter second number : ");
        nb2 = keyboardReader.nextShort();
        System.out.print("Enter third number : ");
        nb3 = keyboardReader.nextShort();
        System.out.print("Enter fourth number : ");
        nb4 = keyboardReader.nextShort();
        System.out.print("Enter five number : ");
        nb5 = keyboardReader.nextShort();

        moyenne = (nb1 + nb2 + nb3 + nb4 + nb5)/5;
        System.out.println("Average of five numbers is: " + moyenne);
    }
}
