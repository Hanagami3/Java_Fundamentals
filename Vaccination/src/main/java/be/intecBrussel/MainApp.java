package be.intecBrussel;

public class MainApp {

    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter();

        Animal monkey = new Monkey();
        System.out.println(monkey.getIsVaccinated());
        monkey.vaccinateAnimal(Disease.POLIO);
        System.out.println(monkey.getIsVaccinated());

        Animal monkey1 = new Monkey(12, "Louis", false, true);
        System.out.println(monkey1.isClean());
        monkey1.treatAnimal();
        System.out.println(monkey1.isClean());

        Animal cat = new Cat(1,"Priam", true, true);
        Animal dog = new Dog(2,"Voltaire", false, true);
        Animal aap = new Monkey(3,"bibi", false, false);
        Animal sam = new Cat(3, "Sam", false, false);
        animalShelter.addAnimal(cat);
        cat.vaccinateAnimal(Disease.POLIO);
        aap.vaccinateAnimal(Disease.POLIO);
        animalShelter.addAnimal(dog);
        animalShelter.addAnimal(aap);
        animalShelter.addAnimal(sam);
        System.out.println(animalShelter.getAnimals());
        System.out.println(animalShelter.countAnimals());

        animalShelter.sortAnimalsByName();
        animalShelter.sortAnimal();
        animalShelter.printAnimals();
        System.out.println();
        animalShelter.printAnimalNotVaccinated(Disease.POLIO);
        System.out.println();

        System.out.println(animalShelter.findOldestAnimal());

    }
}
