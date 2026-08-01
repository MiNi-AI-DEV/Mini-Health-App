import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientService patientService = new PatientService();
        Validator validator = new Validator();
        Report report = new Report();
        CSVReader csvReader = new CSVReader();

        Patient patient = null;

        int choice;

        do {

            System.out.println("\n==============================================");
            System.out.println(" MINI HEALTHCARE PATIENT VALIDATION SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Patient by ID");
            System.out.println("3. Validate Patient");
            System.out.println("4. Generate Report");
            System.out.println("5. Search Patient");
            System.out.println("6. Update Patient");
            System.out.println("7. Delete Patient");
            System.out.println("8. Display All Patients");
            System.out.println("9. Import Patients from CSV");
            System.out.println("10. Exit");
            System.out.println("==============================================");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    patient = patientService.registerPatient();
                    break;

                case 2:
                    patientService.displayPatientById();
                    break;

                case 3:

                    if (patient == null) {

                        System.out.println("No patient registered yet.");

                    } else {

                        boolean result = validator.validatePatient(patient);

                        if (result) {
                            System.out.println("\nPatient Validation Successful.");
                        } else {
                            System.out.println("\nPatient Validation Failed.");
                        }
                    }

                    break;

                case 4:
                    report.generateReport(patientService.getPatientList());
                    break;

                case 5:
                    patientService.searchPatient();
                    break;

                case 6:
                    patientService.updatePatient();
                    break;

                case 7:
                    patientService.deletePatient();
                    break;

                case 8:
                    patientService.displayAllPatients();
                    break;

                case 9:
                    csvReader.readCSV("../patients.csv", patientService);
                    break;

                case 10:
                    System.out.println("Thank you for using Mini Healthcare.");
                    break;

                default:
                    System.out.println("\nInvalid Choice.");
            }

        } while (choice != 10);

        patientService.close(); 
    }
}
