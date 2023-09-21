import java.util.*;

public class Factoriel {

    public static <Classe> void main(String[] args) {

        Scanner keyboardReader = new Scanner (System.in);

        long number;
        long factoriel = 1L;

        do {
        System.out.print("entrer un nombre pour connaitre sa factoriel: ");
            while (!keyboardReader.hasNextInt()) {
                System.out.print("Veullez entrer un nombre entier :");
                keyboardReader.next();
            }
            number = keyboardReader.nextInt();
            if(number > 20)
                System.out.println("Le programme ne calcule que jusque la factorielle de 20");
        }while (number > 20);

        if(number < 0)
            System.out.println("Factorielle d'un nombre négatif imossible");
        else{
        for(int i = 1; i <= number; i++)
            factoriel *= i;
        }
        if(number >= 0)
        System.out.println(factoriel);
    }
}
