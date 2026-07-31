import java.util.ArrayList;
import java.util.Scanner;

public class PatientService implements AutoCloseable {

    private ArrayList<Patient> patientList = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    // Register Patient
    public Patient registerPatient() {

        System.out.println("\n========= Register Patient =========");

        System.out.print("Enter Patient Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender : ");
        String gender = sc.nextLine();

        System.out.print("Enter Phone Number : ");
        String phone = sc.nextLine();

        System.out.print("Enter Admission Date (dd-MM-yyyy) : ");
        String admissionDate = sc.nextLine();

        Patient patient = new Patient(name, age, gender, phone, admissionDate);

        patientList.add(patient);

        System.out.println("\n=================================");
        System.out.println("Patient Registered Successfully!");
        System.out.println("Your Patient ID is : " + patient.getPatientId());
        System.out.println("=================================");

        return patient;
    }

    // Display Patient by ID
    public void displayPatientById() {

        System.out.print("\nEnter Patient ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Patient patient : patientList) {

            if (patient.getPatientId() == id) {

                patient.displayPatient();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nPatient ID not found.");
        }
    }

    // Display All Patients
    public void displayAllPatients() {

        if (patientList.isEmpty()) {

            System.out.println("\nNo patients registered.");
            return;
        }

        System.out.println("\n========== ALL PATIENTS ==========");

        for (Patient patient : patientList) {
            patient.displayPatient();
        }
    }

    // Search Patient by ID
    public void searchPatient() {

        System.out.print("\nEnter Patient ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Patient patient : patientList) {

            if (patient.getPatientId() == id) {

                System.out.println("\nPatient Found");
                patient.displayPatient();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nPatient not found.");
        }
    }

    // Update Patient
    public void updatePatient() {

        System.out.print("\nEnter Patient ID to Update : ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Patient patient : patientList) {

            if (patient.getPatientId() == id) {

                System.out.println("\nCurrent Patient Details");
                patient.displayPatient();

                System.out.println("\nEnter New Details");

                System.out.print("Enter New Name : ");
                patient.setPatientName(sc.nextLine());

                System.out.print("Enter New Age : ");
                patient.setAge(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter New Gender : ");
                patient.setGender(sc.nextLine());

                System.out.print("Enter New Phone Number : ");
                patient.setPhoneNumber(sc.nextLine());

                System.out.print("Enter New Admission Date : ");
                patient.setAdmissionDate(sc.nextLine());

                System.out.println("\nPatient Updated Successfully.");

                System.out.println("\nUpdated Patient Details");

                patient.displayPatient();

                return;
            }
        }

        System.out.println("\nPatient ID not found.");
    }

    // Delete Patient
    public void deletePatient() {

        System.out.print("\nEnter Patient ID to Delete : ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < patientList.size(); i++) {

            if (patientList.get(i).getPatientId() == id) {

                String patientName = patientList.get(i).getPatientName();

                patientList.remove(i);

                System.out.println("\nPatient " + patientName + " deleted successfully.");

                return;
            }
        }

        System.out.println("\nPatient ID not found.");
    }

    // Return Patient List
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    @Override
    public void close() {
        sc.close();
    }
}
public void addPatient(Patient patient) {

    patientList.add(patient);

}