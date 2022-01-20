package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MedicalSurgery {
    private List<Patient> patientList = new ArrayList<>();

    public MedicalSurgery(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> orderedList = new ArrayList<>(patientList);
        Collections.sort(patientList, new PatientComparator());
        return orderedList;
    }

}
