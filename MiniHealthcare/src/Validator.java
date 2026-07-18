public class Validator {

    public boolean validatePatient(Patient patient) {

        boolean isValid = true;

        if (patient.getPatientName().trim().isEmpty()) {
            System.out.println("Error: Patient Name cannot be empty.");
            isValid = false;
        }

        if (patient.getAge() < 1 || patient.getAge() > 120) {
            System.out.println("Error: Invalid Age.");
            isValid = false;
        }

        if (!(patient.getGender().equalsIgnoreCase("Male")
                || patient.getGender().equalsIgnoreCase("Female")
                || patient.getGender().equalsIgnoreCase("Other"))) {

            System.out.println("Error: Invalid Gender.");
            isValid = false;
        }

        if (!patient.getPhoneNumber().matches("\\d{10}")) {
            System.out.println("Error: Phone Number must contain exactly 10 digits.");
            isValid = false;
        }

        if (patient.getAdmissionDate().trim().isEmpty()) {
            System.out.println("Error: Admission Date cannot be empty.");
            isValid = false;
        }

        return isValid;
    }
}