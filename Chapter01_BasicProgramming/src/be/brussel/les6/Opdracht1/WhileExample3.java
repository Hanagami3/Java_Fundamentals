package be.brussel.Opdracht1;

public class WhileExample3 {

    public static void main(String[] args) {

        int i = 0;

        while(i <= 10000){
            if(Math.pow(11,i) > 10000)
                break;
            System.out.println(Math.pow(11,i));
            i++;


        }
    }
}
