package Les1;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jai");
        names.add("Manesh");
        names.add("Ajay");
        names.add("Hemant");
        names.add("Vishal");


        /*
        int counter = 0;
        for(String str : names){
            if (str.length() < 5)
                counter++;
        }
        System.out.println(count + " string with length less than 5")
         */

        //Using stream and Lambda expression
        //long count = names.stream().filter(str -> str.length()<5).count();
        int count = (int)names.stream().filter(str -> str.length()<5).count();
        System.out.println(count + " string with length less than 5");
    }
}
