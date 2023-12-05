package Les1;

public class ArrayOutOfBoundsExceptionExample {

    public static void main(String[] args) {

        String[] maanden = {"Januari", "Februari", "Mart", "April"};

            try {
                for(int i = 0; i < 5; i++)
                    System.out.println(maanden[i] + " ");
            }catch (ClassCastException exception){
                System.out.println(exception.getMessage());
            }finally {
                System.out.println("deze code werkt altijd");
            }
    }
}
