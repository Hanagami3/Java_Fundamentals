import java.util.ArrayList;
import java.util.Scanner;

public class compteur {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList();

        int number;
        int sum = 0;

        System.out.println(Math.abs(-9));

        do {
            System.out.println("entrer un nombre: ");
            number = keyboardReader.nextInt();

            if (number == -1)
                continue;
            else {
                numbers.add(number);
                sum += number;
            }

        }while(number != -1);

        for(int i = 0; i < numbers.size(); i++)
            if (i == 0) {
                Math.abs(numbers.get(i));
                System.out.print(numbers.get(i));
            }
            else if(numbers.get(i) >= 0)
                System.out.print(" + " + numbers.get(i));
            else
                System.out.print(" - " + Math.abs(numbers.get(i)));
        System.out.println(" = " + sum);
    }
}
