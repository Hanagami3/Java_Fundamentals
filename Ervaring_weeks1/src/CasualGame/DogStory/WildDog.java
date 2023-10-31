package CasualGame.DogStory;

import java.util.Random;

public class WildDog extends Dog{

    Random myRandom = new Random();
    private char size;

    public WildDog(){
        super("Wild Dog", 10);
        this.size = 'L';
    }

    public WildDog(String name){
        super.setName(name);
    }
    public WildDog(String name, int lifeSpan, char size){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.setSize('L');
    }

    @Override
    public String getSize() {
        String sizeStr = "";
        if (size == 'S')
            sizeStr = "kleine";
        else if (size == 'M')
            sizeStr = "middelgrote";
        else if (size == 'L') {
            sizeStr = "grote";
        }
        return sizeStr;
    }

    @Override
    public void setSize(char size) {
            if (size == 'S' || size =='M' || size == 'L' )
                this.size = size;
    }

    public void bark(int times) {
        for (int i = 0; i < times; i++)
           super.bark();
    }

    public String hunt(){
        int  prey = myRandom.nextInt(5);
        String result = "";
        switch (prey){
            case 2 :
                result = "The dog caught a deer !";
                break;
            case 3 :
                result = "The dog caught a duck !";
                break;
            case 4 :
                result = "The dog caught a field mouse !";
                break;
            default : result = "The dog didn't catch anything...";
        }
        return result;
    }
}
