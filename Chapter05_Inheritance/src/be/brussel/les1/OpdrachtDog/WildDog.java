package OpdrachtDog;

import java.util.Random;

public class WildDog extends Dog{

    Random myRandom = new Random();
    private char size;

    public WildDog(){
        super("Prick", 10);
        this.size = 'L';
    }

    public WildDog(String name, int lifeSpan){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.size = 'L';
    }
    public WildDog(String name, int lifeSpan, char size){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        super.setSize(size);
    }

    @Override
    public char getSize() {
        return size;
    }

    @Override
    public void setSize(char size) {
        this.size = size;
    }

    public void bark(int times){
        for (int i = 0; i < times; i++)
            super.bark();
    }

    public void hunt(){
        int  prey = myRandom.nextInt(4);
        System.out.println("The dog goes hunting...");
        switch (prey){
            case 0 :
                System.out.println("The dog didn't catch anything!!");
                break;
            case 1 :
                System.out.println("The dog caught a deer!");
                break;
            case 2 :
                System.out.println("The dog caught a duck!");
                break;
            case 3 :
                System.out.println("The dog caught a field mouse!");
                break;
        }


    }
}
