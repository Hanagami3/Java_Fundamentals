package be.brussel.les1.Oefening1;

//methode 7
public class MainCalc {

    public static void main(String[] args) {

        // oefening 1
        int nb1;
        int nb2;
        int nb3;
        //oefening 2
        int nb4;
        //oefening 3
        int nb5;
        int nb6;

        char welkeOefening;
        char welkeOperatie;

        Calculator calculator = new Calculator();

        welkeOefening = calculator.getOefening();
        if (welkeOefening == '1' || welkeOefening == 'A') {
            /*Voor elke oefening, vraagt het programma als de gebruiker zichzelf het nummer wil invoeren of
            als het programma hetzelf doet
            */
            System.out.println("Voor de oefening 1,");
            if (calculator.getRandomlyOfNo()) {
                /*Roep een methode aan die is gemaakt in de Calculator Class. De parameter is het maximum nummer die
                de methode kan vinden.
                */
                nb1 = calculator.getNumberRandomly(1001);
                nb2 = calculator.getNumberRandomly(1001);
                nb3 = calculator.getNumberRandomly(1001);
            }
            else{
                /*Roep een methode aan die is gemaakt in de Calculator Class.
                 Het controleert als de gebruiker wel een int invoert
                 */
                System.out.print("Voor de nummer 1: ");
                nb1 = calculator.getInvoerNummer();
                System.out.print("Voor de nummer 2: ");
                nb2 = calculator.getInvoerNummer();
                System.out.print("Voor de nummer 3: ");
                nb3 = calculator.getInvoerNummer();
            }
            System.out.println();
            System.out.println("De nummers te vergelijken zijn : " + nb1 + "  " + nb2 + "  " + nb3);
            System.out.println("Het kleineste nummer is " + calculator.getsmallestnumber(nb1, nb2, nb3));// <== Aanroep van de "hoofdmethode" voor de oefening1!
            System.out.println();
        }

        if (welkeOefening == '2' || welkeOefening == 'A') {
            System.out.println("Voor de oefening 2,");
            if (calculator.getRandomlyOfNo())
                nb4 = calculator.getNumberRandomly(100);
            else
                nb4 = calculator.getInvoerNummer();
            System.out.println();
            System.out.println("Het nummer te controleren is : " + nb4);
            System.out.println("Bevat het nummer alleen even cijfers ? " + calculator.getevennumber(nb4));// <== Aanroep van de "hoofdmethode" voor de oefening2!
            System.out.println();
        }

        if (welkeOefening == '3' || welkeOefening == 'A') {
            System.out.println("Voor de oefening 3,");
            if (calculator.getRandomlyOfNo()) {
                nb5 = calculator.getNumberRandomly(21);
                nb6 = calculator.getNumberRandomly(21);
            }
            else{
                System.out.print("Voor de nummer 1: ");
                nb5 = calculator.getInvoerNummer();
                System.out.print("Voor de nummer 2: ");
                nb6 = calculator.getInvoerNummer();
            }

            /*Het programme vraagt welke operatie de gebruiker wil kiezen.
            Als een van de vijf operaties is niet gekozen, drukt het programma alle mogeleigheden af
            door de break tussen de if statement.
            */
            System.out.println();
            System.out.println("De nummers gekozen zijn : " + nb5 + "  " + nb6);
            welkeOperatie = calculator.getoperation();
            System.out.println();
            switch (welkeOperatie) {
                case 'A' ://Alle switch case zijn doorgelopen want de break is niet geactiveerd.
                case '+' :
                    System.out.println(nb5 + " + " + nb6 + " = " + calculator.getSumNumber(nb5, nb6));// <== Aanroep van de "hoofdmethode" voor de oefening3 : optellen!
                    if (welkeOperatie != 'A')
                        break;
                case '-':
                    System.out.println(nb5 + " - " + nb6 + " = " + calculator.getDifferenceNumber(nb5, nb6));// <== Aanroep van de "hoofdmethode" voor de oefening3 : aftrekken!
                    if (welkeOperatie != 'A')
                        break;
                case '*':
                    System.out.println(nb5 + " * " + nb6 + " = " + calculator.getProductNumber(nb5, nb6));// <== Aanroep van de "hoofdmethode" voor de oefening3 : optellen! vermenigvuldigen!
                    if (welkeOperatie != 'A')
                        break;
                case '/':
                    calculator.getQuotientNumber(nb5, nb6);// <== Aanroep van de "hoofdmethode" voor de oefening3: delen!
                    if (welkeOperatie != 'A')
                        break;
                case '%':
                    System.out.println(nb5 + " + " + nb6 + " = " + calculator.getModulusNumber(nb5, nb6));// <== Aanroep van de "hoofdmethode" voor de oefening3 : modulus!
                    break;
            }
        }
        System.out.println();
        System.out.println("Dank u wel en tot ziens");
    }
}
