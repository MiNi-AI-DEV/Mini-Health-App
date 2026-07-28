# Mini-Health-App-Healthcare-Patient-Data-Validation-Reporting-System



A Java console/web application that:

Reads patient records from a CSV or database (MySQL)
Validates each record (missing fields, duplicate IDs, wrong date formats, age errors)
Flags and logs all errors automatically
Generates a daily summary report (PDF or Excel) showing total records, error count, error type breakdown
Sends an alert email when error rate crosses a threshold

Tech stack to use :

Java + Spring Boot + MySQL + Apache POI (Excel reports) + JavaMailSender + Maven
Why it's unique:
I have modified Main.java and patientservice.java to register the patient

We'll first build a Java Console Application.

It will:

✅ Register a patient
✅ Display patient details
✅ Validate patient information
✅ Generate a simple report
❌ No MySQL yet
❌ No CSV yet
❌ No PDF yet
❌ No Email yet


We'll progress one step at a time:

Step 1 (Today): Create the project structure and menu.
Step 2: Build the Patient class using constructors and access specifiers.
Step 3: Register a patient using Scanner.
Step 4: Add validation logic.
Step 5: Display patient details.
Step 6: Generate a summary report.
Step 7: Add support for multiple patients.
Step 8: Read patient data from a CSV file.
Step 9: Connect the project to MySQL.
Step 10: Convert it into a Spring Boot web application.

