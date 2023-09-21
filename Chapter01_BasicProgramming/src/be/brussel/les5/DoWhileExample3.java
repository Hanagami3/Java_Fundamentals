package be.brussel.les5;

public class DoWhileExample3 {

    public static void main(String[] args) {

        int x = 21, sum = 0;
        do{
            System.out.print("sum: " + sum);
            System.out.println(" | x: " + x);
            // Execution statements(Body of loop)
            // Here, the line will be printed even if thz condition is false
            sum += x;
            x--;
        //Now checking condition
        }while (x > 10);
        // Summing up
        System.out.println("Summation: " + sum);
    }
}
