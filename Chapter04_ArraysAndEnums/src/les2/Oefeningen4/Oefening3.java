package Oefeningen4;

import java.util.Arrays;

public class Oefening3 {

    public static void main(String[] args) {

        String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};
        String[] newArray = Arrays.copyOf(myArray,5);
        String stringArr = Arrays.toString(newArray);
        System.out.println(stringArr);
    }
}
