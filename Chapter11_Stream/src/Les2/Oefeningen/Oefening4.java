package Les2.Oefeningen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Oefening4 {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3,4);
        int x = integers.stream().reduce(1,(a,b) -> a*b);
        System.out.println("In deze lijst " + integers + ", is het product van alle getallen: " + x);
    }
}
