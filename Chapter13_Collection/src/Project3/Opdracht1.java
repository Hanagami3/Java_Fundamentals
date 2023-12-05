package Project3;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Opdracht1 {

    public static void printPatientWithoutDuplicate() {

        LinkedHashSet<Patient> patientsWithoutDuplicate = new LinkedHashSet<>(Patient.getAllPatients());
        for (Patient patient : patientsWithoutDuplicate)
            System.out.println(patient);
    }

    public static Set<Patient> getPatientWithoutDuplicate() {

        LinkedHashSet<Patient> patientsWithoutDuplicate = new LinkedHashSet<>(Patient.getAllPatients());

        return patientsWithoutDuplicate;
    }


}
