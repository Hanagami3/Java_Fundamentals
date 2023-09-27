package be.brussel.Les3;

import java.util.Random;
public class RandomExample {

    public static void main(String[] args) {

        Random myRandom = new Random();

        boolean randomBoolean = myRandom.nextBoolean();
        System.out.println(randomBoolean);

        double randomDouble = myRandom.nextDouble();
        System.out.println(randomDouble);

        float randomFloat = myRandom.nextFloat();
        System.out.println(randomFloat);

        int randomInt = myRandom.nextInt();
        System.out.println(randomInt);

        int randomBound = myRandom.nextInt(50);
        System.out.println(randomBound);
    }
}
