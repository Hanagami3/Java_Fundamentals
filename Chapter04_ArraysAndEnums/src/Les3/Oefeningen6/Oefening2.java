package be.brussel.Les3.Oefeningen6;

import java.util.Scanner;

public class Oefening2 {

    public static void main(String[] args) {

        System.out.println("Welke dag is het vandaag?");

        Oefening1 weekdag = Oefening1.DONDERDAG;

        switch (weekdag){
            case MAANDAG:
                System.out.println("Vandaag is het maandag");
                break;
            case DINSDAG:
                System.out.println("Vandaag is het dinsdag");
                break;
            case WOENSDAG:
                System.out.println("Vandaag is het woensdag");
                break;
            case DONDERDAG:
                System.out.println("Vandaag is het donderdag");
                break;
            case VRIJDAG:
                System.out.println("Vandaag is het vrijdag");
                break;
            case ZATERDAG:
                System.out.println("Vandaag is het zaterdag");
                break;
            case ZONDAG:
                System.out.println("Vandaag is het zondag");
                break;
        }
    }
}
