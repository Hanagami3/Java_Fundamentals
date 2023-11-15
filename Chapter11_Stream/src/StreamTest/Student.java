package StreamTest;

public class Student extends Person{

    int id;

    private int incrementId = 100;

    public Student(){
        super();
        getIncrementId();
    }

    public Student(String name, String lastName){
        super.name = name;
        super.lastName = lastName;
        getIncrementId();
    }

    private int getIncrementId(){
      incrementId+=1;
        return incrementId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", incrementId=" + incrementId +
                '}';
    }
}
