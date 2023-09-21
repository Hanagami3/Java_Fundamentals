package be.brussel.les5;

public class WhileDoExample2 {

    public static void main(String[] args) {

        int x = 1, sum = 0;

        //Exit when x becomes greater than 10

        while(x <= 10){
            System.out.print("x: " + x);
            System.out.println(" | sum: " + sum);
            // summing up x
            sum = sum + x;
            // Increment the value of x for next iteration
            x++;

        }
        System.out.println("Summation: "+ sum);
    }
}
