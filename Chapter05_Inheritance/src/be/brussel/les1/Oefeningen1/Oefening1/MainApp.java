package Oefeningen1.Oefening1;

public class MainApp {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        System.out.print("this is a " + myDog.getTypeOfAnimal() + "\nthe dog is a " + myDog.getKindDog() + "\n" +
                            "The dog has " + myDog.getEyes() + " eyes and " + myDog.getLegs() + " legs\n" + myDog.getSound());
        myDog.setSound("WOUF WOUF");
        System.out.println(" or " + myDog.getSound());
        System.out.println();


        Cat myCat = new Cat();
        System.out.println("This is a " + myCat.getTypeOfAnimal() + "\nthe cat is a " + myCat.getKindCat() + "\n" +
                            "The cat has " + myCat.getEyes() + " eyes and " + myCat.getLegs() + " legs\n" +myCat.getSound());
        System.out.println();



        Fish myFish = new Fish();
        System.out.println("This is a " + myFish.getTypeOfAnimal() + "\nthe fish is a " + myFish.getKindFish() + "\n" +
                            "The fish has " + myFish.getEyes() + " eyes\n" + myFish.getSound());

    }
}
