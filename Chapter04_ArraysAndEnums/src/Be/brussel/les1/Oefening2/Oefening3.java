package Be.brussel.les1.Oefening2;

public class Oefening3 {

    public static void main(String[] args) {

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int sumNumbers = 0;
        float result;

        for (int elements : numbers)
            sumNumbers += elements;

        result = sumNumbers/numbers.length;
        System.out.println(result);

    }
}
