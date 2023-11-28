package Les2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();

        list.add("Jonathan");
        list.add("Deepika");
        list.add("Elmaz");
        list.add("Mausam");
        list.add("Abdulrazak");
        list.add("Rutger");


        Iterator itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
