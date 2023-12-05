package Les1;

public class NumberFormatExceptionsExample {

    public static void main(String[] args) {

        int a;

        try {
            a = Integer.parseInt("Hello");
            System.out.println("A is: "+a);
        } catch (NumberFormatException exception) {
            //System.out.println("Deze string is niet een getal");
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Exception:" + exception);
        } finally {
            System.out.println("Finally blok werkt");
        }
        System.out.println("Code werkt");

    }
}
