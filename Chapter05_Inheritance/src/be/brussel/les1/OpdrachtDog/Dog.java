package be.brussel.les1.OpdrachtDog;

public class Dog extends Wolf{

    private char size;



    public Dog(){
        this.size = 'M';
    }

    public Dog ()

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void bark(){

    }

    public boolean sit(){
       boolean sit=true;
        return sit;
    }
}
