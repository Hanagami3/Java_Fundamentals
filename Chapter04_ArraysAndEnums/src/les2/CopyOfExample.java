package be.brussel.les2;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyOfExample {

    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3};

        System.out.println("Original Array");

        for (int i = 0; i < originalArray.length; i++)
            System.out.println(originalArray[i] + "");

        int[] newArray = Arrays.copyOf(originalArray, 5);

        newArray[3]= 11;
        newArray[4]= 55;

        System.out.println("\nNew array newArray after modifications:");

        for (int i = 0; i < newArray.length; i++)
            System.out.println(newArray[i] +"");
    }
}
