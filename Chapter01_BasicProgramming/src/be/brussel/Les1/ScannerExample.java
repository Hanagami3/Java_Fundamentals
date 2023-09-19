package be.brussel.Les1;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);

        System.out.print("Enter username : ");
        String userName = keyboardReader.nextLine();

        System.out.println("Username is : " + userName);
    }
}
