package les1;

public class DuoApp {

    public static void main(String[] args) {

        Duo<String> txt = new Duo<>("Hello ", "World");
        System.out.println(txt.getS1() + txt.getS2());

        Duo<Integer> number = new Duo<>(1,5);
        System.out.println(number.getS1() + " + " + number.getS2() +  " = " + (number.getS1() + number.getS2()));
    }
}
