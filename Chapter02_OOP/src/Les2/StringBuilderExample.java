package be.brussel.Les2;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();

        str.append("Hello world");
        System.out.println(str);


        StringBuilder string = new StringBuilder("Hello universe");

        System.out.println(string);


        StringBuilder sttr = new StringBuilder("walter, mike");

        sttr.insert(6, ", edwin");
        System.out.println(sttr);

        StringBuilder sstr = new StringBuilder("hello world");
        String txt = sstr.toString();

        System.out.println(txt);

        System.out.println(sstr.reverse());
    }
}
