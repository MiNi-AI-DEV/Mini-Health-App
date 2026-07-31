public class Patient {

    // Static member to generate Patient IDs
    private static int nextPatientId = 1001;

    // Instance variables
    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String phoneNumber;
    private String admissionDate;

    // Default Constructor
    public Patient() {

    }

    // Parameterized Constructor
    public Patient(String patientName, int age, String gender,
                   String phoneNumber, String admissionDate) {

        this.patientId = nextPatientId++;
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.admissionDate = admissionDate;
    }
    public Patient(int patientId, String patientName, int age,
               String gender, String phoneNumber,
               String admissionDate)
    {

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.admissionDate = admissionDate;
    }

    public int getPatientId() {
    return patientId;
    }

    public String getPatientName() {
    return patientName;
    }

    public int getAge() {
    return age;
    }

    public String getGender() {
    return gender;
    }

    public String getPhoneNumber() {
    return phoneNumber;
    }

    public String getAdmissionDate() {
    return admissionDate;
    }
    public void setPatientName(String patientName) {
    this.patientName = patientName;
    }

    public void setAge(int age) {
    this.age = age;
    }

    public void setGender(String gender) {
    this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    }

    public void setAdmissionDate(String admissionDate) {
    this.admissionDate = admissionDate;
        }

    // Display Method
    public void displayPatient() {

        System.out.println("\n========== Patient Details ==========");
        System.out.println("Patient ID      : " + patientId);
        System.out.println("Patient Name    : " + patientName);
        System.out.println("Age             : " + age);
        System.out.println("Gender          : " + gender);
        System.out.println("Phone Number    : " + phoneNumber);
        System.out.println("Admission Date  : " + admissionDate);
        System.out.println("=====================================");
    }
}