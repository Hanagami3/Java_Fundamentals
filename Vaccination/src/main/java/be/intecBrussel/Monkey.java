package be.intecBrussel;

import java.util.Map;

public class Monkey extends Animal {

    private boolean isHyperActive;

    public Monkey() {
    }

    public Monkey(int age, String name, boolean isClean, boolean isHyperActive) {
        super(age, name, isClean);
        this.isHyperActive = isHyperActive;
    }

    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }

    @Override
    public void treatAnimal() {
        super.treatAnimal();
        System.out.println(isHyperActive ? "De aap is hyper actief en we gaan het behandeld" :
                "De dier is niet hyper actief");
        if (isHyperActive)
            isHyperActive = false;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "isHyperActive=" + isHyperActive
        +super.toString();

    }

}
