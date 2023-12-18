package be.intecBrussel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Animal implements Vaccinateable, Treatable, Comparable<Animal> {

    private int age;
    private String name;
    private int animalNumber;

    private boolean isClean;

    private Map<Disease, Boolean> isVaccinated;




    public Animal() {
        age = 0;
        name = "UNKNOW";
        animalNumber = 0;
        isClean = false;
        isVaccinated = new HashMap<>();
        setIsVaccinated();
    }


    public Animal(int age, String name, boolean isClean) {
        this.age = age;
        this.name = name;
        this.animalNumber = 0;
        this.isClean = isClean;
        isVaccinated = new HashMap<>();
        setIsVaccinated();
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated() {
        isVaccinated.put(Disease.CHICKENPOCKS,false);
        isVaccinated.put(Disease.FLUE, false);
        isVaccinated.put(Disease.POLIO, false);
        isVaccinated.put(Disease.HEPATITISA, false);
    }


    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.replace(disease, true);
        System.out.println("De dier " + name + " is gevaccineerd tegen " + disease.toString().toLowerCase() );
    }

    @Override
    public void treatAnimal() {
        if (!isClean)
            isClean = true;
    }

    @Override
    public String toString() {
        return  ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                ", isClean=" + isClean +
                ", isVaccinated=" + isVaccinated +
                '}';
    }

    @Override
    public int compareTo(Animal animal) {

        if (this.animalNumber > animal.animalNumber)
            return 1;
        else
            return -1;
    }
}
