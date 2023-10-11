package Oefeningen5;

import java.util.Arrays;

public class Oefening2 {

    public static void main(String[] args) {

        int[ ][ ] numbers = {{1, 2, 3}, {4, 5, 6}};

        String strDeep = Arrays.deepToString(numbers);
        System.out.println(strDeep);

        String str1 = Arrays.toString(numbers[0]);
        String str2 = Arrays.toString(numbers[1]);
        System.out.println(str1 + ", " + str2);

    }
}
