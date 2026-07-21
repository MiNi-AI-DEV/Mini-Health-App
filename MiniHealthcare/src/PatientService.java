import java.util.ArrayList;
import java.util.Scanner;

public class PatientService {

     private ArrayList<Patient> patientList = new ArrayList<>();

    public Patient registerPatient() {

        Scanner sc = new Scanner(System.in);

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

        System.out.println("\nPatient Registered Successfully!");

        return patient;
    }
}
public void displayAllPatients() 
{

    if (patientList.isEmpty()) 
    {

        System.out.println("\nNo patients available.");

        return;
    }

    System.out.println("\n========== Patient List ==========");

    for (Patient patient : patientList)
    {

        patient.displayPatient();

    }

}