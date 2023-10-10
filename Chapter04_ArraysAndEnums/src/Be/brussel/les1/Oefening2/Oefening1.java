package Be.brussel.les1.Oefening2;

public class Oefening1 {

    public static void main(String[] args) {

        int [] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 0;

        for (int elements : myArray) {
            System.out.println(result + " + " + elements);
            result += elements;

        }
        System.out.println();
        System.out.println("final result: " + result);
    }
}
