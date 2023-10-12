package be.brussel.Les4;

public class equalsExample1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        double c = 5.5;

        boolean equal01 = (a == b);
        boolean equal02 = (a == c);

        System.out.println(equal01);
        System.out.println(equal02);


        String s1 = "intec";
        String s2 = "intec";
        String s3 = "Intec";
        String s4 = "Java";

        boolean equal03 = (s1 == s2);
        boolean equal04 = (s2 == s3);
        boolean equal05 = (s4 == s4);

        System.out.println(equal03);
        System.out.println(equal04);
        System.out.println(equal05);
    }
}
