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

we'll create Patient.java.

In that class you'll learn how to use:

Private data members
Default constructor
Parameterized constructor
Static member (patientCounter)
Methods to display patient details

We'll design it like a real hospital software model instead of a simple classroom example.

Create the MiniHealthcare project folder.
Create the src folder.
Create these five Java files:
Main.java
Patient.java
PatientService.java
Validator.java
Report.java

Create the Main Menu
we'll create Patient.java.
In that class you'll learn how to use:

Private data members
Default constructor
Parameterized constructor
Static member (patientCounter)
Methods to display patient details

Create the Patient Class
The Patient class is the heart of our application. It represents a single patient and stores all the patient's information.

Java concepts we'll use
✅ Access Specifiers (private, public)
✅ Default Constructor
✅ Parameterized Constructor
✅ Static Member
✅ Methods

we'll make Option 1: Register Patient actually work.
We'll then create a Patient object using the parameterized constructor and display the patient's details.

Module 3: Register Patient
When the user selects 1. Register Patient then it should create a Patient object and display the patient's details.

Step 1: Update PatientService.java
Step 2: Update Main.java


You have now used:

✅ Objects
✅ Constructors
✅ Returning an object from a method
✅ Calling methods from another class
✅ Storing an object in a variable
✅ Displaying object data

Module 4: Patient Data Validation

Goal

When a user registers a patient, the program should automatically check:

Field	Validation
Patient Name	Cannot be empty
Age	Must be between 1 and 120
Gender	Male / Female / Other
Phone Number	Exactly 10 digits
Admission Date	Cannot be empty (we'll check the date format later)

Step 1: Update Validator.java
Step 2: Update Patient.java
Step 3: Update Main.java
Step 4: Modify Case 3

Why this module is important

This is the beginning of the "Patient Data Validation" part of your project title. Later, we'll extend it to validate:

CSV records
MySQL records
Date formats using Java's Date API
Duplicate patient IDs
Missing mandatory fields in uploaded files

All of those will reuse the same Validator class, just like in real enterprise applications.

Learning Objective

Today you're learning something that every enterprise Java application uses:

Encapsulation (getters)
Validation logic
Regular expressions (matches("\\d{10}"))
Separation of responsibilities:
Patient → stores data
PatientService → handles input
Validator → validates data
Main → controls program flow

This separation makes the code cleaner and easier to extend.

Module 5 – Store Multiple Patients
Step 1 – Learn ArrayList
Step 2 – Create Patient List
Step 3 – Save Every Patient
Step 4 – Display All Patients
Step 5 – Modify Main.java
New Java Concepts You'll Learn

In this module, you'll learn several Core Java topics that are essential for interviews and real projects:

ArrayList
Generic Collections (ArrayList<Patient>)
Enhanced for loop
isEmpty()
add()
Managing multiple objects

These are much more powerful than using arrays and are widely used in enterprise Java applications.

We'll implement Search Patient, where a user can enter a Patient ID like 1002 and the program will display only that patient's details.

That feature will prepare us for searching records in CSV files and MySQL databases later.

Module 6 – Search Patient
Step 1: Add a getter for Patient ID
Step 2: Create searchPatient() in PatientService.java
Step 3: Modify Main.java
Step 4: Test

New Java Concepts You've Learned

With this module, you've now practiced:

✅ ArrayList
✅ Enhanced for loop
✅ Searching objects in a collection
✅ Getter methods
✅ Boolean flag (found)
✅ Breaking out of a loop with break

These are very common interview topics and are used in many Java applications
After search works, we'll build Generate Report.

Instead of just printing "Generate Report Selected"
This module will teach you:

Loops for calculations
Counters
Conditional logic
Basic statistics
Report generation

✅ Requirement 1: Print Patient ID after Registration
✅ Requirement 2: Display Patient by Entering Patient ID

Module 7: Generate Daily Summary Report
Goal

When the user selects 4. Generate Report, the application should display something like:

=========================================
       DAILY SUMMARY REPORT
=========================================
Total Patients      : 5
Male Patients       : 3
Female Patients     : 2
Other Patients      : 0
Average Age         : 31.60 Years
=========================================

Step 1: Create Report Method
Step 2: Update PatientService.java
Step 3: Update Main.java
Step 4: Modify Case 4

After this, we'll continue with:

Module 8: Patient Data Validation (Advanced)
Duplicate Patient IDs
Date format validation (dd-MM-yyyy)
Phone number validation using Regular Expressions
Name validation (letters only)
Module 9: CSV File Support
Read patient records from a CSV file.
Validate every record automatically.
Module 10: MySQL Integration
Save patients in a database.
Search directly from MySQL.

At that point, your project will start looking like a real healthcare management
