package Les3;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Inas");
        v.add("Adem");
        v.add("Ilias");
        v.add("Marwane");


        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
