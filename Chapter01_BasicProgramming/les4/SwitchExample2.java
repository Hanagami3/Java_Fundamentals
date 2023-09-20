package be.brussel.les4;

public class SwitchExample2 {

    public static void main(String[] args) {

        String str = "we";

        switch(str){
            case "I":
                System.out.println("I want to become a doctor.");
                //break;
            case "we":
                System.out.println("We are Indian.");
                //break;
            case "you":
                System.out.println("You are my crony friend.");
                //break;
            case "our":
                System.out.println("Our Indian flag has tri-color.");
                //break;
            default :
                System.out.println("It is the default statement");
        }
    }
}
