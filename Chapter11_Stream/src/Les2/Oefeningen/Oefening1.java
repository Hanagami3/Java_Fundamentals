package Les2.Oefeningen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Oefening1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 10, 2, 3, 8, 3, 5);
        double count = numbers.stream().filter(x->x%2==0).count();
        double gemiddelde = numbers.stream().filter(x->x%2==0)
                .reduce(0,(a,b)-> (a+b));
        gemiddelde/= count;
        System.out.println("De gemiddelde van alle even getallen van deze lijst: " + numbers + " is: " +gemiddelde);

    }
}
