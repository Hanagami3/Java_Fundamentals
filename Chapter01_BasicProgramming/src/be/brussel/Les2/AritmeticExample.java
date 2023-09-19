package be.brussel.Les2;

public class AritmeticExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("Sum of A and B = " + sum);
        System.out.println("Subtraction of A and B = " + sub);
        System.out.println("Multiplication of A and B = " + mul);
        System.out.println("Division of A and B = " + div);
        System.out.println("Modulus of A and B = " + mod);

        int inc = ++b;
        System.out.println("Incrementing B: " + inc);

        int dec = --a;
        System.out.println("Decrementing B: " + dec);

    }
}
