package be.brussel.Les2;

public class BooleanExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        boolean equal = (a == b);
        boolean notEqual = (a != b);
        boolean biggerThan = (a > b);
        boolean smallerThan = (a < b);
        boolean biggerEqual = (a >= b);
        boolean smallerEqual = (a <= b);

        System.out.println(equal);
        System.out.println(notEqual);
        System.out.println(biggerThan);
        System.out.println(smallerThan);
        System.out.println(biggerEqual);
        System.out.println(smallerEqual);
        System.out.println();

        ////////////////////////////////////

        boolean aa = true;
        boolean bb = false;

        boolean result01 = (aa && bb);
        boolean result02 = (aa || bb);
        boolean result03 = (!(aa && bb));

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);

    }
}
