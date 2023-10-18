package OpdrachtDog;

public class MainApp {

    boolean food;
    boolean nice;
    //++ Coat, size, ,name, final, Akita

    public static void main(String[] args) {
        WildDog chance = new WildDog();
        //chance.hunt();
       // chance.bark(3);
        System.out.println(chance.getName());
        System.out.println(chance.getSize());

        System.out.println();
        Dog voltaire = new Dog();
        //voltaire.bark();
        System.out.println(voltaire.getName());
        System.out.println(voltaire.getSize());

        System.out.println();
        Wolf whiteFang = new Wolf();
        System.out.println(whiteFang.getName());
        //System.out.println(whiteFang.getLifeSpan());

        System.out.println();
        BelgianMalinois rex = new BelgianMalinois();
        System.out.println(rex.getSize());
        System.out.println(rex.getName());

        //WildDog shadow = new WildDog("Chien", 20, 'S');

    }
}
