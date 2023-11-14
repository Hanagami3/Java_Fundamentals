package StreamTest;

public class Student extends Person{

    int id;

    private int incrementId;

    public Student(){
        super();
        incrementId = 100;
    }

    public Student(String name, String lastName){
        super.name = name;
        super.lastName = lastName;
        incrementId = 100;
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
