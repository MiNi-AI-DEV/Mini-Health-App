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


