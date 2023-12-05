package Les4.Set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        System.out.println("LinkedHashSet: " + set);

        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple? " + containsApple);

        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange? " + removed);

        int size = set.size();
        System.out.println("Size of LinkedHashSet: " + size);

        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is LinkedHashSet empty? " + isEmpty);
    }
}
