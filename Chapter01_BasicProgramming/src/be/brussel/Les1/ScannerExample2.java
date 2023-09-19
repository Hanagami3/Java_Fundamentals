package be.brussel.Les1;

import java.util.Scanner;

public class ScannerExample2 {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = keyboardReader.nextLine();

        System.out.print("Enter age : ");
        int age = keyboardReader.nextInt();

        System.out.print("Enter salary : ");
        double salary = keyboardReader.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
