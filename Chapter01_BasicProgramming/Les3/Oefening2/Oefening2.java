package be.brussel.Les3.Oefening2;

public class Oefening2 {

    public static void main(String[] args) {

        boolean bool01 = true;
        boolean bool02 = false;
        boolean result;

        result = (bool01 && bool02);
        System.out.println(result);
        result = (bool01 || bool02);
        System.out.println(result);
        result = (!(bool01 && bool02));
        System.out.println(result);
    }
}
