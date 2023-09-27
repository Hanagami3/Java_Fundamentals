package be.brussel.Les2.Oefening2;

import java.util.Scanner;

public class Oefening1 {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        char exit;

        System.out.println("Welcome!");
        //loop until the user enters != Y
        do {
            short sameLetter = 0;
            System.out.println("Enter a word to verify that it is a palindrome: ");
            String str = myScanner.next().toLowerCase();
            //reverse de word
            StringBuilder strb = new StringBuilder(str);
            strb.reverse();
            // check if it’s a palindrome
            if (str.contains(strb.toString()))
                System.out.println(str + " is a palindrome");
            else {
                System.out.println(str + " is not a palindrome (" + strb + ")");
                //Indicates the number of letters that are the same if it is not a palindrome
                for (int i = 0; i < strb.length(); i++)
                    if(strb.charAt(i) == str.charAt(i))
                        sameLetter++;
                System.out.println(sameLetter + " letters are the same");
            }

            System.out.print("Do you want to write a new word? (Y/N) : ");
            exit = myScanner.next().charAt(0);
        }while(exit == 'Y' || exit == 'y');
        System.out.println("Thank you and goodbye");
    }
}
