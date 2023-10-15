package Oefeningen1.Oefening1;

public class Cat extends Animal{

    public Cat(){
        super(4,2,"MIAOU");
    }

    private String kindCat = "Maine Coon";

    public String getKindCat(){
        return kindCat;
    }

    public void setKindCat(String kindCat){
        this.kindCat = kindCat;
    }

}
