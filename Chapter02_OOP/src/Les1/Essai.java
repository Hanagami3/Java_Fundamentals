public class Essai {

    public static void main(String[] args) {

        String str = "Java Exercices!";

        System.out.println(str.substring( str.indexOf( "Exercices" ), str.length() -1) );


        String str1 = "hello world";
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if (i % 2 == 0)
                str2 = str2 + str1.substring(i, i + 1).toUpperCase();
            else
                str2 = str2 + str1.substring(i, i + 1);

        }
        System.out.println(str2);
    }
}
