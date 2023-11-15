package Les2.Oefeningen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening5 {

    public static void main(String[] args) {

        List<Integer> getallen = Arrays.asList(1,2,1,4,6,8,6);
        List<Integer> lijstNoDubbel = getallen.stream().distinct().collect(Collectors.toList());
        System.out.println("Array in het begin: " + getallen);
        System.out.println("Array zonder dubbelen: " + lijstNoDubbel);
    }
}
