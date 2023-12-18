package be.intecBrussel;

import java.util.Map;

public class Dog extends Animal{

    private boolean hasFoulBreath;

    public Dog(int age, String name, boolean isClean, boolean hasFoulBreath) {
        super(age, name, isClean);
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        super.treatAnimal();
        System.out.println(hasFoulBreath ? "De hond heeft een slecht adem en we gaan het behandeld" :
                "De dier heeft geen slecht adem");
        if (hasFoulBreath)
            hasFoulBreath = false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hasFoulBreath= " + hasFoulBreath
                +super.toString();

    }
}
