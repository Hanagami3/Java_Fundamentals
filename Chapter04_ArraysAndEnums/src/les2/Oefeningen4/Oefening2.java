package Oefeningen4;

import java.util.Arrays;

public class Oefening2 {

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5};
        int[] myIntArray2 = Arrays.copyOf(myIntArray, 10);

        for (int i = 5; i < myIntArray2.length; i++)
            myIntArray2[i] = i+1;

        for (int num : myIntArray2)
            System.out.print(num + " ");
    }
}
