package be.brussel.Les1.Oefening1;

public class Oefening1 {

    public static void main(String[] args) {

        String str = "Java Exercices!";

        System.out.println(str.substring( str.indexOf( "Exercices" ), str.length() -1) );
    }
}
