package be.brussel.les6.Oefening5;

public class Oefening2 {

    public static void main(String[] args) {

      double number = 10.99;
      double numberRound = Math.round(number);

      // Manueel casting : double naar int
      int myInt = (int) number;
      int myIntRound = (int) numberRound;

      System.out.println(myInt);
      //Print if rounded before casting
      System.out.println(Math.round(myIntRound));

    }
}
