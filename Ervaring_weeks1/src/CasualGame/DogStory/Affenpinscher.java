package CasualGame.DogStory;

public class Affenpinscher extends HomelyDog{

    private String color;
    private String nickname;

    public Affenpinscher(){
        super("Affenpinscher",13, 'S','L');
        this.color = "zwart of bruin";
        this.nickname = "Wilhelm";
    }

    public Affenpinscher(String nickname){
        super.setName("affenpinscher");
        super.setLifeSpan(13);
        super.setSize('S');
        super.setCoat('L');
        this.color = "black";
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public void dance(boolean sugar){
        if (sugar)
            System.out.println("De hond danst");
        else
            System.out.println("De hond kijkt je niet aan");
    }
}
