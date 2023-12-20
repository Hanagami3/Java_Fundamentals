package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.service.ForestNotebook;

public class Animal implements Comparable<Animal>{

    protected String name;
    protected double weight;
    protected double height;
    protected double length;


    public Animal(String name){
        this.name = name;
        System.out.println("not ok");
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        setWeight(weight);
        setHeight(height);
        setLength(length);
        ForestNotebook.addAnimal(this);
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0)
            weight = 0;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            height = 0;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0)
            length = 0;
        this.length = length;
    }


    @Override
    public int compareTo(Animal animal) {

        if (this.name.compareTo(animal.name) > 0)
            return 1;
        else
            return -1;

    }
}
