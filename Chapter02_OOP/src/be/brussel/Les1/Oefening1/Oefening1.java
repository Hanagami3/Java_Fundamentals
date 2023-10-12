package be.brussel.Les1.Oefening1;

public class Oefening1 {

    public static void main(String[] args) {

        String str = "Java Exercises!";

        System.out.println(str.substring( str.indexOf( "Exercises" ), str.length() -1) );
    }
}
