package be.brussel.Les3.Oefeningen6.Oefening3;

public class MainApp {

    public static void main(String[] args) {

        HolidayDestinatie[] holidayDestinatie = HolidayDestinatie.values();

        System.out.println("Hier zijn de mogelijke destinaties");
        for (HolidayDestinatie destinatie : holidayDestinatie)

            System.out.println((destinatie.ordinal()+1) + ". " + destinatie.toString().substring(0,1).toUpperCase() + destinatie.toString().substring(1).toLowerCase());

    }
}
