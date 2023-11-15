package Les2.Oefeningen;

import java.util.Arrays;
import java.util.List;

public class Oefening3 {

    public static void main(String[] args) {

        List<Integer> getallen = Arrays.asList(1,2,4,6,8);
        boolean allMatch = getallen.stream().allMatch((n -> n % 2 == 0));
        System.out.println("In deze lijst " + getallen + ", zijn alle getallen even?");
        System.out.println(allMatch);
    }
}
