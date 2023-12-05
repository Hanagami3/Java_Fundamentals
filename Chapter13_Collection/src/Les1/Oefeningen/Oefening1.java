package Les1.Oefeningen;

import java.util.ArrayList;
import java.util.Arrays;

public class Oefening1 {

    public static void main(String[] args) {

        ArrayList<String> wordSet1 = new ArrayList<>(Arrays.asList("rood", "groen", "geel", "blauw"));
        ArrayList<String> wordSet2 = new ArrayList<>(Arrays.asList("Oranje", "roze", "bruin", "paars"));
        ArrayList<String> allWord = new ArrayList<>(wordSet1);

        allWord.addAll(wordSet2);

        for (String word : allWord)
            System.out.println(word);
    }
}
