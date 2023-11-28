package Les4.Set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(3);
        System.out.println("TreeSet: " + set);

        Integer firstElement = set.first();
        Integer lastElement = set.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        Integer higherValue = set.higher(4);
        System.out.println("First element higher than 4: " + higherValue);

        Integer lowerValue = set.lower(5);
        System.out.println("Element lower than 5 : " + lowerValue);

        TreeSet<Integer> descendingSet = (TreeSet<Integer>) set.descendingSet();
        System.out.println("Descending TreeSet: " + descendingSet);

        TreeSet<Integer> subSet = (TreeSet<Integer>) set.subSet(3,8);
        System.out.println("Subset TreeSet: " + subSet);

        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty);
    }
}
