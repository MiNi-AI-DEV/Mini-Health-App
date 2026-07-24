import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Patient patient = null;

        try (Scanner sc = new Scanner(System.in)) {
            // PatientService is not accessible at compile-time; use reflection to instantiate and invoke.
            Class<?> psClass = Class.forName("PatientService");
            java.lang.reflect.Constructor<?> psCtor = psClass.getDeclaredConstructor();
            psCtor.setAccessible(true);
            Object patientService = psCtor.newInstance();
            Validator validator = new Validator();
            Report report = new Report();
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
                        {
                            java.lang.reflect.Method m = psClass.getMethod("registerPatient");
                            patient = (Patient) m.invoke(patientService);
                        }
                        break;

                    case 2:
                        {
                            java.lang.reflect.Method m = psClass.getMethod("displayAllPatients");
                            m.invoke(patientService);
                        }
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
                        {
                            java.lang.reflect.Method m = psClass.getMethod("getPatientList");
                            @SuppressWarnings("unchecked")
                            java.util.ArrayList<Patient> list = (java.util.ArrayList<Patient>) m.invoke(patientService);
                            report.generateReport(list);
                        }
                        break;

                    case 5:
                        {
                            java.lang.reflect.Method m = psClass.getMethod("searchPatient");
                            m.invoke(patientService);
                        }
                        break;
                    case 6:
                        System.out.println("Exit the program...");
                        break;

                    default:
                        System.out.println("Invalid Choice.");
                }

            } while (choice != 6);
        } catch (ReflectiveOperationException e) {
            System.out.println("Error accessing PatientService: " + e.getMessage());
        }
    }
}
