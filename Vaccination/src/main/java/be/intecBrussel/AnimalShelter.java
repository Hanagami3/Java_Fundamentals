package be.intecBrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalShelter {

    private int animalID;

    private List<Animal> animals;


    public AnimalShelter() {
        animals = new ArrayList<>();
        animalID = 10;
    }

    public AnimalShelter(int animalID) {
        this.animalID = animalID;

    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void printAnimals(){
        animals.stream().forEach(System.out::println);
    }

    public void sortAnimal(){
        animals.sort(Animal::compareTo);
    }

    public void sortAnimalsByName(){
        animals.stream().sorted(Comparator.comparing(a -> a.getName()));

    }

    public void sortAnimalsByAge(){
        animals.stream().sorted(Comparator.comparing(a -> a.getAge()));

    }

    public void  printAnimalNotVaccinated(Disease disease){
        animals.stream().filter(a -> a.getIsVaccinated().get(disease).equals(false))
                .forEach(System.out::println);
    }

    public Optional<Animal> findAnimal(int animalNumber){
        Animal unknown = new Animal() {};
        return Optional.of(animals.stream().filter(a -> a.getAnimalNumber() == animalNumber)
                .findAny()
                .orElse(unknown));
    }

    public Optional<Animal> findAnimal(String name) {
        Animal unknown = new Animal() {};
        return Optional.of(animals.stream().filter(a -> a.getName().equals(name))
                .findAny()
                .orElse(unknown));
    }

    public void treatAnimal(int animalNumber){

    }

    public void treatAnimal(String name){

    }

    public void treatAllAnimal(){

    }

    public Animal findOldestAnimal(){

        return animals.stream().max(Comparator.comparing(Animal::getAge)
                .thenComparing(Animal::getAnimalNumber))
                .get();

    }

    public int countAnimals(){
        return animals.size();
    }

    public void addAnimal(Animal animal){
        animal.setAnimalNumber(animalID);
        animals.add(animal);
        animalID++;


    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animalID=" + animalID +
                ", animals=" + animals +
                '}';
    }
}
