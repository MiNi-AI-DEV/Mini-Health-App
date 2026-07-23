import java.util.ArrayList;
import java.util.Scanner;

public class PatientService implements AutoCloseable {

    private ArrayList<Patient> patientList = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

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

        Patient patient = new Patient(
                name,
                age,
                gender,
                phone,
                admissionDate);
        patientList.add(patient);

        System.out.println("\n=================================");
        System.out.println("Patient Registered Successfully!");
        System.out.println("Your Patient ID is : " + patient.getPatientId());
        System.out.println("=================================");

        return patient;
    }

    public void displayPatientById() 
    {

        System.out.print("\nEnter Patient ID : ");
        int id = sc.nextInt();

        boolean found = false;

        for (Patient patient : patientList) {

        if (patient.getPatientId() == id)
        {

            patient.displayPatient();
            found = true;
            break;

        }

    }

    if (!found) 
    {

        System.out.println("\nPatient ID not found.");

    }

}

    public void searchPatient() 
    {

        System.out.print("\nEnter Patient ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Patient patient : patientList) 
        {
            if (patient.getPatientId() == id) 
            {
                patient.displayPatient();
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Patient not found.");
        }

    }

    @Override
    public void close()
 {
        sc.close();
    }
}
