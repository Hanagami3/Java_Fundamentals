package be.brussel.Les1;

public class OtherExample {

    public static void main(String[] args) {

        for (int i = 98; i > 0; i -= 7)

            System.out.println(i);
            System.out.println();
///////////////////////////////////
        int j = 100;

        while(j >= 50) {
            System.out.println(j);
            j--;
        }
/////////////////////////////////////////
        System.out.println();
        int k = 0;
        do{
            if (k == 0 || k == 1 )
                System.out.println("Maxime a " + k + " an");

            else
                System.out.println("Maxime a " + k + " ans");
            k++;
        }while(k <= 31);

    }
}
