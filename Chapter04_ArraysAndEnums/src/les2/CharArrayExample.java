package be.brussel.les2;

public class CharArrayExample {

    public static void main(String[] args) {

        String stringToChar = "From String to char array";
        char[] charArray = stringToChar.toCharArray();

        for (char ch : charArray){

            System.out.println(ch + "|");
        }
    }
}
