package be.brussel.les1.Example1;

public class AnimalApp {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        myAnimal.animalSound();

        Animal myCat = new Cat();
        myCat.animalSound();

        Animal myDuck = new Duck();
        myDuck.animalSound();

    }
}
