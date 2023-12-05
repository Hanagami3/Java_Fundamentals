package Les2.Oefeningen;

import java.util.Arrays;
import java.util.LinkedList;

public class Oefening3 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(35, 4, 90, 100, 18));
        printList(list);
        System.out.println();
        printSum(list);
        System.out.println();
        printAverage(list);

    }

    public static void printList(LinkedList<Integer> list){
        System.out.println(list);
    }

    public static void printSum(LinkedList<Integer> list){

        System.out.println("The sum of the list: " + list.stream()
                .reduce(0, (x,y)->x+y));

    }

    public static void printAverage(LinkedList<Integer> list){
        System.out.println("The Average of the list: " + list.stream()
                .reduce(0, Integer::sum)/list.size());
        //.this.stream().mapToInt_____.average().getasdouble
    }
}
