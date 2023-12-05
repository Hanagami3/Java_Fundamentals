package Les2;

public class ExceptionThrowExample {

    public static void main(String[] args) {

        ageCheck(20);
    }

    public static void ageCheck(Integer num) throws ArithmeticException, NumberFormatException{

        if (num<18){
            //gooie exception met java throw keyword
            throw new ArithmeticException("U mag niet stemmen");
        }
        else {
            System.out.println("U  kunt stemmen");
        }
    }
}
