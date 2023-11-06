package be.brussel.Oefeningen.Oefening1;

public class Chest implements Lock{

    private final char key;
    public Chest(){
        this.key = 'N';
    }

    public Chest(char key){
        this.key = key;
    }

    @Override
    public void lock() {
        if (key != 'Y')
            System.out.println("The chest is locked");
        unlock();
    }

    @Override
    public void unlock() {
        if (key == 'Y')
            System.out.println("The chest is unlock");
    }
}
