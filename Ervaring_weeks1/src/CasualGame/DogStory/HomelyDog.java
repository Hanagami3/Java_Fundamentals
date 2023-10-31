package CasualGame.DogStory;

public class HomelyDog extends Dog {
    private char size;
    private char coat;

    public HomelyDog(){
        super("Homely dog", 11 );
        this.size = 'M';
        this.coat = '?';
    }

    public HomelyDog(String name){
        super.setName(name);
        super.setLifeSpan(11);
        this.size = 'M';
        this.coat = '?';
    }

    public HomelyDog(String name,int lifeSpan, char size, char coat){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.setSize(size);
        this.setCoat(coat);
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(char size) {
        this.size = size;
    }

    public String getCoat() {
        String coatStr = "";
        if (coat == 'L')
            coatStr = "Lang";
        if (coat == 'S')
            coatStr = "kort";
        return coatStr;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }
}
