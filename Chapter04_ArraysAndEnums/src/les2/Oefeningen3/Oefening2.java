package Oefiningen3;

import java.util.Arrays;

public class Oefening2 {

    public static void main(String[] args) {

        String[] firstArray = {"Intec", "is", "the", "best!"};
        String[] secondArray = {"C#", "is", "the", "worst!"};
        String[] tmpArray = Arrays.copyOf(firstArray,4);

        System.out.println("FirstArray: " + Arrays.toString((firstArray)));
        System.out.println("SecondArray: " + Arrays.toString((secondArray)));

        System.out.println();
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < 4; i++) {
                firstArray[i] = secondArray[i];
                secondArray[i] = tmpArray[i];
            }
        System.out.println("FirstArray: " + Arrays.toString((firstArray)));
        System.out.println("SecondArray: " + Arrays.toString((secondArray)));
        }

    }
}