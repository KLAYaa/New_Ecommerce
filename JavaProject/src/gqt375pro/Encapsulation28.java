package gqt375pro;
import java.util.Scanner;

class PatientRecord {
    private String patientName;
    private int patientAge;

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public int getPatientAge() {
        return patientAge;
    }
}

class Encapsulation28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientRecord patient = new PatientRecord();

        System.out.print("Enter patient name: ");
        patient.setPatientName(sc.nextLine());

        System.out.print("Enter patient age: ");
        patient.setPatientAge(sc.nextInt());

        System.out.println("Patient Name: " + patient.getPatientName());
        System.out.println("Patient Age: " + patient.getPatientAge());
    }
}