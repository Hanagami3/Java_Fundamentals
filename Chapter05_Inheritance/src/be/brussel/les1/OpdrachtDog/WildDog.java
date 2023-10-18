package be.brussel.les1.OpdrachtDog;

public class WildDog extends Dog{

    private char size;

    public WildDog(char size){
        super();
        this.size = 'L';
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

    }

    public void hunt(){

    }
}
