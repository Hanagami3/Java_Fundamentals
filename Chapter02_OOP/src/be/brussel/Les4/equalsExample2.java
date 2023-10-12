package be.brussel.Les4;

public class equalsExample2 {

    public static void main(String[] args) {


        String str01 = "Hello Intec";
        String str02 = new String("Hello Intec");
        String str03 = str02;

        boolean equal01 = (str01 == str02);

        boolean equal02 = (str02 == str03);

        System.out.println(equal01);
        System.out.println(equal02);

        System.out.println(str01.equals((str02)));
        System.out.println(str01.equals((str03)));
        System.out.println(str02.equals((str03)));
///////////////////////////////////////////////////////////////////
        System.out.println();

        String s1 = new String ("HELLO");
        String s2 = new String ("HELLO");

        System.out.println("s1 and s2 are equal : " + (s1 == s2));
        System.out.println("s1 and s2 are equal : " + (s1.equals(s2)));

        s1 = s2;

        System.out.println("s1 and s2 are equal : " + (s1 == s2));


    }
}
