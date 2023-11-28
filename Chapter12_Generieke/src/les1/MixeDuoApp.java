package les1;

public class MixeDuoApp {

    public static void main(String[] args) {

        MixedDuo<String, Integer> mixe = new MixedDuo<>("Dog", 20);

        System.out.println(mixe.getObject1() + " " + (mixe.getObject2()*2));
    }
}
