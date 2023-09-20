package be.brussel.les4.Oefening3;

import java.util.Scanner;

public class Oefening3 {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner (System.in);
        System.out.print("Enter a month : ");
        String month = keyboardReader.next().toUpperCase();
        int daysCount = 0;
        int longMonth = 31;
        int shortMonth = 30;

        // branching switch that increases daysCount of the number of days of the month and months preceding
        switch(month){
            case "JANUARY":
                daysCount += longMonth;
                break;
                //February = 29 = shortMonth - 1
            case "FEBRUARY":
                daysCount += shortMonth + longMonth -1;
                break;
            case "MARCH":
                daysCount += (2*longMonth) -1;
                break;
            case "APRIL":
                daysCount += (2*shortMonth) + (2*longMonth) -1;
                break;
            case "MAY":
                daysCount += (2*shortMonth) + (3*longMonth) - 1;
                break;
            case "JUNE":
                daysCount += (3*shortMonth) + (3*longMonth) -1;
                break;
            case "JULY":
                daysCount += (3*shortMonth) + (4*longMonth) -1;
                break;
            case "AUGUSTUS":
                daysCount += (3*shortMonth) + (5*longMonth) - 1;
                break;
            case "SEPTEMBER":
                daysCount += (4*shortMonth) + (5*longMonth) - 1;
                break;
            case "OCTOBER":
                daysCount += (4*shortMonth) + (6*longMonth) - 1;
                break;
            case "NOVEMBER":
                daysCount += (5*shortMonth) + (6*longMonth) - 1;
                break;
            case "DECEMBER":
                daysCount += (5*shortMonth) + (7*longMonth) - 1;
                break;
            default:
                System.out.println("this month doesn't exist");

        }
        //print the result of the switch
        System.out.println("Util the end of " + month + ", these year count " + daysCount + " days.");
    }


}
