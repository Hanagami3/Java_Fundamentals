package Les2.Oefeningen;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

public class Oefening2 {

    public static void main(String[] args) {

        LinkedList<String> sentence = new LinkedList<>(Arrays.asList("Een", "korte", "zin", "met", "zes", "woorden"));
        printSentence(sentence);
        System.out.println();
        printSentenceInReverseOrder(sentence);
        System.out.println();
        printNumberOfWords(sentence);
    }

    public static void printSentence(LinkedList<String> sentence){

        sentence.stream().forEach(System.out::println);

    }

    public static void printSentenceInReverseOrder(LinkedList<String> sentence){
        System.out.println("omgekeerde lijst: ");
        sentence.stream().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        //Collection.reverse(list);
        //System.out.println(____);
    }

    public static void printNumberOfWords(LinkedList<String> sentence){
        System.out.println("Aantal woorden: " + sentence.size());
    }
}
