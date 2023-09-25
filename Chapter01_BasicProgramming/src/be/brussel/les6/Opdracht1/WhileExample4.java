package be.brussel.Opdracht1;

public class WhileExample4 {

    public static void main(String[] args) {

        char alphabet[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                           'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z' };
        int i = 0;

        while(i < 25) {
            System.out.println(alphabet[i]);
            i++;
        }
    }
}
