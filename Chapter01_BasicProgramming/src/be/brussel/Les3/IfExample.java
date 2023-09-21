package be.brussel.Les3;

public class IfExample {

    public static void main(String[] args) {

        int number = 11;

        if (number < 100)
            //this line is printed out when number is smaller than 100! When the condition is TRUE
            System.out.println("The value of number is smaller than 100");
        else
            //this line is printed out when number is not smaller than 100! When the condition is False
            System.out.println("The value of number is NOT smaller than 100");

///////////////////////////////////////////////
        System.out.println();
        int time = 12;

        if (time < 10)
            System.out.println("Good morning.");
        else if (time < 20)
            System.out.println("Good day.");
        else
            System.out.println("Good evening");

    }
}
