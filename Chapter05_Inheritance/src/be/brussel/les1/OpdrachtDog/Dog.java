package OpdrachtDog;

public class Dog extends Wolf{

    private char size;

    public Dog(){
        super("Rufus",12 );
        this.size = 'M';
    }

    public Dog(String name, int lifeSpan){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.size = 'M';
    }

    public Dog(String name, int lifeSpan, char size){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.setSize(size);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void bark(){
        System.out.println("Wouf wouf");
    }

    public void sit(){
        System.out.println("Sit!!");
        System.out.println("The dog is sitting");
    }
}
