package Oefeningen1.Oefening2;

public class Main {

    public static void main(String[] args) {

        Student1 maxime = new Student1();

        maxime.setStudent(true);
        System.out.println(maxime.getName() + " student: " + maxime.isStudent());
        System.out.println("Size: " + maxime.getSize());
        System.out.println("Eyes: " + maxime.getEYES() + " | Heart: " + maxime.getHEART() + " | Mouth: " + maxime.getMOUTH());
        System.out.println("Number of students: " + maxime.getCount() + "\n");
        
        Student2 mio = new Student2();
        mio.setStudent(true);
        System.out.println(mio.getName() + " student: " + mio.isStudent());
        System.out.println("Size: " + mio.getSize());
        System.out.println("Eyes: " + mio.getEYES() + " | Heart: " + mio.getHEART() + " | Mouth: " + mio.getMOUTH());
        System.out.println("Number of students: " + mio.getCount() + "\n");

        Instructor instructor = new Instructor();
        System.out.println(instructor.getName() + " student: " + instructor.isStudent());
        System.out.println("Eyes: " + instructor.getEYES() + " | Heart: " + instructor.getHEART() + " | Mouth: " + instructor.getMOUTH() + "\n");

        TaalCoach taalCoach = new TaalCoach();
        System.out.println(taalCoach.getName() + " student: " + taalCoach.isStudent());
        System.out.println("Eyes: " + taalCoach.getEYES() + " | Heart: " + taalCoach.getHEART() + " | Mouth: " + taalCoach.getMOUTH() + "\n");

        System.out.println("Number of students: " + Student.getCount() + "\n");
    }
}
