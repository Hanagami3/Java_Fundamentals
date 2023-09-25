package be.brussel.Opdracht1;

public class ForExample6 {

    public static void main(String[] args) {

        for(int i = -10; i <= 10; i++) {

            String tellen = i > 0 ? "+" + i : "" + i;

            System.out.println(tellen);
        }
    }
}
