import java.util.ArrayList;

public class Report {

    public void generateReport(ArrayList<Patient> patientList) {

        if (patientList.isEmpty()) {
            System.out.println("\nNo patient records available.");
            return;
        }

        int totalPatients = patientList.size();
        int male = 0;
        int female = 0;
        int other = 0;
        int totalAge = 0;

        for (Patient patient : patientList) {

            totalAge += patient.getAge();

            if (patient.getGender().equalsIgnoreCase("Male")) {
                male++;
            } else if (patient.getGender().equalsIgnoreCase("Female")) {
                female++;
            } else {
                other++;
            }
        }

        double averageAge = (double) totalAge / totalPatients;

        System.out.println("\n=========================================");
        System.out.println("       DAILY SUMMARY REPORT");
        System.out.println("=========================================");
        System.out.println("Total Patients : " + totalPatients);
        System.out.println("Male Patients  : " + male);
        System.out.println("Female Patients: " + female);
        System.out.println("Other Patients : " + other);
        System.out.printf("Average Age    : %.2f Years%n", averageAge);
        System.out.println("=========================================");
    }
}
