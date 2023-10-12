package be.brussel.les1.Oefeningen2;

public class Oefening2 {

    public static void main(String[] args) {

        String str = "Maak van deze string een char array";

        char [] charArray = new char[str.length()];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = str.charAt(i);
            System.out.println(charArray[i]);
        }
    }
}
