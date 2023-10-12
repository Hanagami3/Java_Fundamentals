package be.brussel.Les3.Oefening5;

import java.util.*;

public class Oefening1 {

    public static void main(String[] args) {

        int i = 0;
        Random myRandom = new Random();

        while (i < 5) {
            int nb = myRandom.nextInt();
            System.out.println(nb);
            i++;
        }
    }
}
