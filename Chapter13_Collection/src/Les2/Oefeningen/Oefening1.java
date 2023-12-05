package Les2.Oefeningen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Oefening1 {

    public static void main(String[] args) {

        ArrayList<String> kleurenArr = new ArrayList<>(Arrays.asList("rood", "groen", "geel", "blauw"));

        LinkedList<String> kleurenLin = new LinkedList<>(kleurenArr);

        Iterator itr = kleurenLin.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


    }
}
