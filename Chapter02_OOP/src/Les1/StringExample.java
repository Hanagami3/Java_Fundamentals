package be.brussel.Les1;

public class StringExample {
    public static void main(String[] args) {

        String name1 = "maxime";
        System.out.println(name1 + "  -->  " + name1.toUpperCase());

        String name2 = "MAXIME";
        System.out.println(name2 + "  -->  " + name2.toLowerCase());

        String str1 = "Hello world";
        System.out.println(str1.length());

        String str2 = "";
        System.out.println(str2.isBlank());
        String str3 = " ";
        System.out.println(str3.isBlank());
        String str4 = "H W";
        System.out.println(str4.isBlank());

        String str5 = "hello world";
        System.out.println(str5.replace('e', 'a'));
        System.out.println(str5.replace('l', 'L'));


        System.out.println(str5.indexOf("world"));

        System.out.println(str5.contains("world"));

        System.out.println(str5.substring(6,11));

        String str6 = "   hello world    ";
        System.out.println(str6.strip() + name2);
        System.out.println(str6.stripLeading() + name2);
        System.out.println(str6.stripTrailing() + name2);
    }
}
