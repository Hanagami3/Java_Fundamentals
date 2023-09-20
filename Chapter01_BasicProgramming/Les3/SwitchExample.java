package be.brussel.Les3;

public class SwitchExample {

    public static void main(String[] args) {

        int day = 4;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Day number doesn't exist");
        }

        String month = "july";

        switch(month){
            case "january" :
                System.out.println("January");
                break;
            case "february" :
                System.out.println("February");
                break;
            case "march" :
                System.out.println("Mars");
                break;
            case "april" :
                System.out.println("April");
                break;
            case "may" :
                System.out.println("May");
                break;
            case "june" :
                System.out.println("June");
                break;
            case "july" :
                System.out.println("July");
                break;
            case "augustus" :
                System.out.println("Augustus");
                break;
            case "september" :
                System.out.println("September");
                break;
            case "october" :
                System.out.println("October");
                break;
            case "november" :
                System.out.println("November");
                break;
            case "december" :
                System.out.println("December");
                break;
            default:
                System.out.println("this month doesn't exist");
        }



    }
}
