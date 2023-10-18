package be.brussel.les1.Oefeningen1.Oefening1;

public class Animal {


    private int legs;
    private int eyes;
    private String sound;
    private String typeOfAnimal = "pet";


    public Animal() {}

    public Animal(int eyes, String sound){
        this.eyes = eyes;
        this.sound = sound;
    }

   public Animal(int legs, int eyes, String sound){
        this.legs = legs;
        this.eyes = eyes;
        this.sound = sound;
   }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getTypeOfAnimal() {
        return this.typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal){
        this.typeOfAnimal = typeOfAnimal;
    }

}
