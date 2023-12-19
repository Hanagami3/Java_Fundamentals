package be.intecBrussel;

import java.util.Map;

public class Dog extends Animal{

    private boolean hasFoulBreath;


    public Dog() {
        super();
        hasFoulBreath = false;
    }

    public Dog(int age, String name, boolean isClean, boolean hasFoulBreath) {
        super(age, name, isClean);
        this.hasFoulBreath = hasFoulBreath;
    }


    @Override
    public void treatAnimal() {
        super.treatAnimal();
        System.out.println(hasFoulBreath ? "De hond '" + getName() + "' heeft een slecht adem en we gaan het behandeld" :
                "De hond '" + getName() + "' heeft geen slecht adem");
        if (hasFoulBreath)
            hasFoulBreath = false;
    }


    @Override
    public String toString() {
        return "\nDOG\n" +
                super.toString() +
                "\nHasFoulBreath= " + hasFoulBreath;

    }
}
