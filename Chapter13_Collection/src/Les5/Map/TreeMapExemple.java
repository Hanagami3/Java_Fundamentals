package Les5.Map;


import java.util.TreeMap;

public class TreeMapExemple {

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap();

        treeMap.put("Apple",10);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 8);

        int quantityOfApple = treeMap.get("Apple");
        System.out.println("Aantal appals: " + quantityOfApple);

        boolean containsBanana = treeMap.containsKey("Banana");
        System.out.println("Bevat banana? " + containsBanana);

        int size = treeMap.size();
        System.out.println("Grotte van de TreeMap: " + size);

        for(String key : treeMap.keySet())
            System.out.println("Sleutel:" + key);

        for (int value : treeMap.values())
            System.out.println("Waarde: " + value);

        treeMap.clear();
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("Is de TreeMap leeg? " + isEmpty);
    }
}
