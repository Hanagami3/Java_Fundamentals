package be.brussel.les5;
import java.util.Random;
import java.util.Scanner;

public class OtherExample5 {

    public static void main(String[] args) {

        int i = 0;
        double num1;

        System.out.print(num1 = Math.pow(5,4));

        double num2;
        while(i <= 10) {
            System.out.println(Math.round(num2 = Math.random() * 10));
            i++;
        }

        int num3;
        System.out.println(num3 = Math.max(40, 100));

        // Importeren van de Random class


// creëren van een nieuw object
        Random random = new Random();

// Het genereert een boolean value
        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

// Het genereert een double value
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

// Het genereert een float value
        float randomFloat = random.nextFloat();
        System.out.println(randomFloat);

// Het genereert een int value
        int randomInt = random.nextInt();
        System.out.println(randomInt);

// Het genereert een int value tussen een specifieke waarden.
        int randomIntBound = random.nextInt(50);
        System.out.println(randomIntBound);


    }
}
