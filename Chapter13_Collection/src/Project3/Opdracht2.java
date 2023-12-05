package Project3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Opdracht2{
    public static void printPatientTemperatureSorted(){
        PriorityQueue<Patient> sortedPatient = new PriorityQueue<>(Comparator.comparing(Patient::getTemperature)
                .reversed());

        sortedPatient.addAll(Opdracht1.getPatientWithoutDuplicate());

        while (!(sortedPatient.isEmpty()))
            System.out.println(sortedPatient.poll());

    }

    public static void printPatientAgeSorted(){
        PriorityQueue<Patient> sortedPatient = new PriorityQueue<>(Comparator.comparing(Patient::getAge)
                .reversed());

        sortedPatient.addAll(Opdracht1.getPatientWithoutDuplicate());

        while (!(sortedPatient.isEmpty()))
            System.out.println(sortedPatient.poll());

    }
}
