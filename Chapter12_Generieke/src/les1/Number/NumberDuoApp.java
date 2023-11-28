package les1.Number;

public class NumberDuoApp {

    public static void main(String[] args) {

        NumberDuo<Integer> nd1 = new NumberDuo<>(2,5);
        NumberDuo<Double> nd2 = new NumberDuo<>(2.5,4.7);
        NumberDuo<Number> nd3 = new NumberDuo<>(2,4);

        System.out.println(nd1.sum());
        System.out.println(nd2.sum());
        System.out.println(nd3.sum());
        //system.out.println(nb4.getFirst());


    }
}
