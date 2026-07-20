public class Validator {

    public boolean validatePatient(Patient patient) {

        boolean isValid = true;

        // Name Validation
        if (patient.getPatientName().trim().isEmpty()) {
            System.out.println("❌ Patient Name cannot be empty.");
            isValid = false;
        }

        // Age Validation
        if (patient.getAge() < 1 || patient.getAge() > 120) {
            System.out.println("❌ Age must be between 1 and 120.");
            isValid = false;
        }

        // Gender Validation
        String gender = patient.getGender();

        if (!(gender.equalsIgnoreCase("Male")
                || gender.equalsIgnoreCase("Female")
                || gender.equalsIgnoreCase("Other"))) {

            System.out.println("❌ Gender must be Male, Female or Other.");
            isValid = false;
        }

        // Phone Validation
        if (!patient.getPhoneNumber().matches("\\d{10}")) {

            System.out.println("❌ Phone Number must contain exactly 10 digits.");
            isValid = false;
        }

        // Admission Date
        if (patient.getAdmissionDate().trim().isEmpty()) {

            System.out.println("❌ Admission Date cannot be empty.");
            isValid = false;
        }

        return isValid;
    }

}