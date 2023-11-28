package Les4.Set;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {


        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");

        System.out.println("HashSet: " + set);

        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple? " + containsApple);

        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange? " + removed);

        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }
}
