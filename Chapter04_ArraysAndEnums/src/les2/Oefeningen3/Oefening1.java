package be.brussel.les2.Oefeningen3;

public class Oefening1 {

    public static void main(String[] args) {

        String myString = "Char Array!";
        char [] charArray = myString.toCharArray();

        for (int i = 0; i < charArray.length; i++)
            System.out.print("|" + i + " = " + charArray[i]);
        System.out.println("|");


    }
}
