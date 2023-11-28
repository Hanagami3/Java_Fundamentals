package Les1.Oefeningen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Oefening2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();

        for (int i =0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        numbers.sort(Comparator.reverseOrder());
        for (int number : numbers)
            System.out.println(number);

          /*numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);*/
    }
}
