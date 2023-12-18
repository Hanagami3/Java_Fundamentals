package be.intecBrussel;

import java.util.Map;

public class Cat extends Animal {

    private boolean hasLongNails;

    public Cat() {
        super();
        hasLongNails = false;
    }

    public Cat(int age, String name, boolean isClean, boolean hasLongNails) {
        super(age, name, isClean);
        this.hasLongNails = hasLongNails;
    }


    @Override
    public void treatAnimal() {
        super.treatAnimal();
        System.out.println(hasLongNails ? "De cat heeft lange nagels en we gaan het behandeld" :
                "De dier heeft geen lange nagels");
        if (hasLongNails)
            hasLongNails = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasLngNails=" + hasLongNails
                +super.toString();

    }
}
