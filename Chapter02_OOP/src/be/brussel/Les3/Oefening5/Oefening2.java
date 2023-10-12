package be.brussel.Les3.Oefening5;

import java.util.*;

public class Oefening2 {

    public static void main(String[] args) {

        Random myRandom = new Random();

        System.out.println("Here are the lotto numbers : ");

        for(int i = 0; i < 6; i++){
            int nb = myRandom.nextInt(1,46);
            System.out.println(nb);
        }
        System.out.println("And the bonus number is : " + myRandom.nextInt(1, 10));
    }
}

