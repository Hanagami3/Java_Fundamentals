package Oefeningen1.Oefening2;

public class Student extends Person{
    private String name;
    private int size;
    private static int count;
    public Student(){
    }

    public Student(String name, int size){
        this.name = name;
        this.size = size;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }
}
