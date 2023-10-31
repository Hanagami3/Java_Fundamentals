package CasualGame.DogStory;

public class Akita extends HomelyDog{

    private char gender;

    public Akita(){
        super("Akita",12, 'M', 'S');
        this.gender = 'F';
    }

    public Akita(String name){
        super.setName(name);
        super.setLifeSpan(12);
        super.setSize('M');
        super.setCoat('S');
        this.gender= 'F';
    }

    public String getGender() {
        String genderStr = "";
        if (gender == 'F')
            genderStr = "vrouwelijk";
        if (gender == 'M')
            genderStr = "mannelijk";
        return genderStr;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void layDown(){

    }


}
