package Les2.Oefeningen;

import java.util.Arrays;
import java.util.List;

public class Oefening2 {

    public static void main(String[] args) {

        List<String> staden = Arrays.asList("Roma", "New York", "Amsterdam", "Paris");
        List<Integer> lengthMax = staden.stream().map(x -> x.length())
                .max(Integer::compare).stream()
                .toList();

        System.out.println("In deze lijst " + staden + ", is de lengte van de langste String: " + lengthMax);

    }
}
