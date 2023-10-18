package OpdrachtDog;

public class Affenpinscher extends HomelyDog{

    private String color;
    private String nickname;

    public Affenpinscher(){
        super("Dog",13);
        this.color = "black";
        this.nickname = "Wilhelm";
    }

    public Affenpinscher(String name, int lifeSpan){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.color = "black";
        this.nickname = "Wilhelm";
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
            System.out.println("The dog dances");
        else
            System.out.println("The dog don't look at you");
    }
}
