package be.brussel.les4.Oefening3;

import java.util.Scanner;

public class EvanOdda {

    public static void main(String[] args) {

        int number;
        Scanner keyboardReader = new Scanner (System.in);


            System.out.println("Welcom to EvenOdda");

            System.out.println("Enter '0' for exit");
            //Loop until de user press 0
        do {
            // User enter a number
            System.out.print("Please enter a number : ");
            number = keyboardReader.nextInt();
            // if the result of the modulo is zero, the number is even.
            if ((number % 2) == 0)
                System.out.println("This number is even");
                // else de number is odd
            else
                System.out.println("This number is odd");
        }while (number != 0);

        System.out.println("Thank you for using our application :)");
    }
}
