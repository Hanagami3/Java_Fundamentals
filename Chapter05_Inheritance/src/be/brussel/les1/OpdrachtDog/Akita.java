package OpdrachtDog;

public class Akita extends HomelyDog{

    private char gender;

    public Akita(){
        super("Inu",12);
        this.gender = 'F';
    }

    public Akita(String name, int lifeSpan){
        super.setName(name);
        super.setLifeSpan(lifeSpan);
        this.gender= 'F';
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
