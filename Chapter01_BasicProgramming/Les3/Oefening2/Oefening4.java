package be.brussel.Les3.Oefening2;

public class Oefening4 {

    public static void main(String[] args) {

        short shortNum = 101;
        float floatNum = 10.99F;
        boolean booVar = true;

        System.out.print(floatNum + " + " + shortNum + " = ");
        floatNum += shortNum;
        System.out.println(floatNum);

        System.out.print(floatNum + " - " + shortNum + " = ");
        floatNum -= shortNum;
        System.out.println(floatNum);

        System.out.print(floatNum + " * " + shortNum + " = ");
        floatNum *= shortNum;
        System.out.println(floatNum);

        System.out.print(floatNum + " / " + shortNum + " = ");
        floatNum /= shortNum;
        System.out.println(floatNum);

        System.out.print(floatNum + " % " + shortNum + " = ");
        floatNum %= shortNum;
        System.out.println(floatNum);

        System.out.println();
        shortNum = - 20000;
        floatNum = 1010001001.989710283f;

        System.out.print(shortNum + " + " + floatNum + " = ");
        shortNum += floatNum;
        System.out.println(shortNum);

        System.out.print(shortNum + " - " + floatNum + " = ");
        shortNum -= floatNum;
        System.out.println(shortNum);

        System.out.print(shortNum + " * " + floatNum + " = ");
        shortNum *= floatNum;
        System.out.println(shortNum);

        System.out.print(shortNum + " / " + floatNum + " = ");
        shortNum /= floatNum;
        System.out.println(shortNum);

        System.out.print(shortNum + " % " + floatNum + " = ");
        shortNum %= floatNum;
        System.out.println(shortNum);

        System.out.println();

        shortNum = 20000;

        System.out.println();

        booVar = (shortNum <= floatNum);
        System.out.println(booVar);
        booVar = (shortNum > floatNum);
        System.out.println(booVar);
        booVar = (floatNum == shortNum);
        System.out.println(booVar);
        booVar = (shortNum != floatNum);
        System.out.println(booVar);

    }
}
