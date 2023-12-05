package Les1;

public class ArithmeticExceptionsExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c;

        try {
            c = a/b;
            System.out.println(c);
        } catch (ArithmeticException exception){
            System.out.println("Het getal kan niet door nul worden gedeeld.");
        } finally {
            System.out.println("Finally blok werkt");
        }
        System.out.println("Code werkt");
    }
}
