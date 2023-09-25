import java.util.Scanner;

public class bonForExemple3 {


    public static void main(String[] args) {

        int nombre = 1;

        for(int i = 1; i <= 10000; i++){

            if (nombre >= 10000)
                break;
            else {
                System.out.println(nombre);
                nombre *= 11;
            }
        }


    }
}