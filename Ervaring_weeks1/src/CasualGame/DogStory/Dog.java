package CasualGame.DogStory;

public class Dog extends Wolf{

    private char size;

    public Dog(){
        super("Dog",12 );
        this.size = 'M';
    }

    public Dog(String name, int lifeSpan){
        super.setName(name);
        super.setLifeSpan(12);
        this.size = 'M';
    }

    public Dog(String name, int lifeSpan, char size){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.setSize(size);
    }

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

    public void setSize(char size) {
        if (size == 'S' || size =='M' || size == 'L' )
            this.size = size;
    }

    public void bark(){
        System.out.print("WOUF ");
    }

    public void sit(){
        System.out.println("Sit!!");
        System.out.println("The dog is sitting");
    }

    @Override
    public void makeNoise() {
        super.makeNoise("Waf Waf");
    }
}
