package be.brussel.Les2;

import java.util.*;

public class SimpleCalculator {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner keyboardReader = new Scanner(System.in);

        System.out.print("1st nummer: ");
        num1 = keyboardReader.nextInt();
        System.out.print("2st nummer: ");
        num2 = keyboardReader.nextInt();

        int som = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + som);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + mul);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + mod);
    }
}
