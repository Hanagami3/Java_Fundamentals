package les1.Oefeningen;

public class MainApp {

    public static void main(String[] args) {

        Pair<String> stringPair = new Pair<>("Dag", "wereld");
        Pair<Integer>  integerPair = new Pair<>(67, 43);
        Pair<Boolean> booleanPair = new Pair<>(true,false);


        System.out.println(stringPair.getWaard1() + " " + stringPair.getWaard2());
        System.out.println(integerPair.getWaard1() + " + " + integerPair.getWaard2() + " = " + (integerPair.getWaard1()+integerPair.getWaard2()));
        System.out.println(booleanPair);

    }
}
