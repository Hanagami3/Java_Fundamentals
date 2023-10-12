package Oefeningen6.Oefening3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        //Om de index te krijgen.
        HolidayDestinatie[] holidayDestinatie = HolidayDestinatie.values();

        //Print met de eerste letter in groot letter en de rest in klein
        System.out.println("Hier zijn de mogelijke destinaties");
        for (HolidayDestinatie destinatie : holidayDestinatie)
            System.out.println((destinatie.ordinal()+1) + ". " + destinatie.toString().substring(0,1).toUpperCase() + destinatie.toString().substring(1).toLowerCase());
        System.out.println();

        HolidayDestinatie Destinatie = HolidayDestinatie.CONGO;

        Destinatie.getDestinatie(Destinatie);

    }
}
