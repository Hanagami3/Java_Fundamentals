package OpdrachtDog;

public class HomelyDog extends Dog {
    private char size;
    private char coat;

    public HomelyDog(){
        super("Oscar", 11 );
        this.size = 'M';
        this.coat = 'S';
    }

    public HomelyDog(String name,int lifeSpan){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.size = 'M';
        this.coat = 'S';
    }

    public HomelyDog(String name,int lifeSpan, char size, char coat){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.setSize(size);
        this.setCoat(coat);
    }

    @Override
    public char getSize() {
        return size;
    }

    @Override
    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }
}
