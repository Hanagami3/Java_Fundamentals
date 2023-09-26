package be.brussel.Opdracht1;

public class ForExample3 {

    public static void main(String[] args) {


        for(int i = 0; i <= 10000; i++){


            if (i >= 10000)
                break;
            else {
                i *= 11;
                System.out.println(i);
            }
        }


    }
}
