package be.intecBrussel;

public class MainApp {

    public static void main(String[] args) {

        Animal cat1 = new Cat(16,"Sam", true, true);
        Animal dog1 = new Dog(23,"Voltaire", false, true);
        Animal monkey1 = new Monkey(111,"Chichi", true, false);
        Animal monkey2 = new Monkey(-2,"Alex", false, false);
        Animal dog2 = new Dog(5,"Cinnamon", true, true);
        Animal dog3 = new Dog(10, "Gipsy", false, false);
        Animal monkey3 = new Monkey(32, "Alma", true, true);
        Animal cat2 = new Cat(12, "Petra", false, false);
        Animal cat3 = new Cat(3, "Jude", false, true);
        Animal cat4 = new Cat(27, "Praline", true, false);

       AnimalShelter animalShelter = new AnimalShelter();
       animalShelter.addAnimal(cat1);
       animalShelter.addAnimal(dog1);
       animalShelter.addAnimal(monkey1);
       animalShelter.addAnimal(monkey2);
       animalShelter.addAnimal(dog2);
       animalShelter.addAnimal(dog3);
       animalShelter.addAnimal(monkey3);
       animalShelter.addAnimal(cat2);
       animalShelter.addAnimal(cat3);
       animalShelter.addAnimal(cat4);

       System.out.println("-- gesorteerd volgens de naam volgorde --");
       animalShelter.sortAnimalsByName();
       animalShelter.printAnimals();

       cat1.vaccinateAnimal(Disease.POLIO);
       cat2.vaccinateAnimal(Disease.POLIO);
       cat3.vaccinateAnimal(Disease.POLIO);
       cat4.vaccinateAnimal(Disease.POLIO);


       System.out.println("\n-- gesorteerd volgens hun natuurlijke volgorde --");
       animalShelter.sortAnimal();
       animalShelter.printAnimals();

       monkey1.vaccinateAnimal(Disease.FLUE);
       monkey2.vaccinateAnimal(Disease.FLUE);
       monkey3.vaccinateAnimal(Disease.FLUE);

       System.out.println("\n-- gesorteerd volgens de age volgorde --");
       animalShelter.sortAnimalsByAge();
       animalShelter.printAnimals();

        System.out.println("\n-- Dieren die niet gevaccineerd is --");
        animalShelter.printAnimalNotVaccinated(Disease.POLIO);

        System.out.println("\n--");




    }
}
