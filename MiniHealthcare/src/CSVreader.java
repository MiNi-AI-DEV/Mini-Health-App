import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public void readCSV(String fileName, PatientService patientService) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int patientId = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String gender = data[3];
                String phone = data[4];
                String admissionDate = data[5];

                Patient patient = new Patient(
                        patientId,
                        name,
                        age,
                        gender,
                        phone,
                        admissionDate);

                patientService.addPatient(patient);

                System.out.println("Imported : " + patient.getPatientName());

            }

            br.close();

            System.out.println("\nCSV Import Completed Successfully.");

        } catch (IOException e) {

            System.out.println("Error reading file.");

        } catch (Exception e) {

            System.out.println("Invalid data found : " + e.getMessage());

        }

    }

}   