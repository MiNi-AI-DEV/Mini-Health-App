import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientService patientService = new PatientService();
        Validator validator = new Validator();
        Patient patient = null;

        int choice;

        do {

            System.out.println("\n==============================================");
            System.out.println(" MINI HEALTHCARE PATIENT VALIDATION SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Patient");
            System.out.println("3. Validate Patient");
            System.out.println("4. Generate Report");
            System.out.println("5. Search Patient");
            System.out.println("6. Exit");
            System.out.println("==============================================");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    patient = patientService.registerPatient();
                    break;

               case 2:

                patientService.displayAllPatients();

                break;

                 case 3:

                if (patient == null) {

                System.out.println("No patient registered yet.");

                } else {

                 boolean result = validator.validatePatient(patient);

                if (result) {

                System.out.println("\n✅ Patient Validation Successful.");

                } else {

                System.out.println("\n❌ Patient Validation Failed.");

                }

                }

                break;

                case 4:
                    System.out.println("Generate Report Selected");
                    break;

                case 5:
                    System.out.println("Search Patient Selected");
                    break;
                case 6:
                    System.out.println("Exit the program...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}