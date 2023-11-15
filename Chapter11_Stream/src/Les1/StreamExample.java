package Les1;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {

        List<String> myPlaces = new ArrayList<>();
        myPlaces.add("Nepal, Kathmandu");
        myPlaces.add("Nepal, Pokhara");
        myPlaces.add("India, Delhi");
        myPlaces.add("USA, New York");
        myPlaces.add("Africa, Nigeria");

        System.out.println("Place from Nepal: ");

        //Filter places from Nepal
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .forEach((p) -> System.out.println(p));
    }
}
