package Oefeningen1.Oefening2;

public class Person {

    private final int MOUTH = 1;
    private final int EYES = 2;
    private final int HEART = 1;
    private boolean student;
    private String name;

    public Person(){

    }
    public Person(boolean student){
        this.student = student;
    }
    public Person(String name, boolean student){
        this.name = name;
        this.student = student;
    }

    public int getMOUTH() {
        return MOUTH;
    }

    public int getEYES() {
        return EYES;
    }

    public int getHEART() {
        return HEART;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }
}
