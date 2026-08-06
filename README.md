# Mini-Health-App-Healthcare-Patient-Data-Validation-Reporting-System



🏁 PHASE 1 — Clean Architecture (Milestone 1)
Goal: Refactor the current project into a professional package structure without changing functionality.

Step 1: Convert to a Package-Based Project
Inside src, create these packages:

src/
│
├── app/
│     Main.java
│
├── model/
│     Patient.java
│
├── service/
│     PatientService.java
│
├── validation/
│     Validator.java
│
├── report/
│     Report.java
│
├── file/
│     CSVReader.java
│
└── util/
      InputHelper.java   (we'll create later)
Why?
Right now every class is in the default package.

That is not how professional Java applications are organized.

Each package has one responsibility.

For example:

model
contains only data classes.

service
contains business logic.

validation
contains validation rules.

report
contains reporting.

file
handles file operations.

This follows the Single Responsibility Principle (SRP).

Step 2: Add Package Statements
Example:

Patient.java

package model;
PatientService.java

package service;
Validator.java

package validation;
Report.java

package report;
CSVReader.java

package file;
Main.java

package app;
Step 3: Fix Imports
Once you add packages, import the classes.

Example in Main.java:

import model.Patient;
import service.PatientService;
import validation.Validator;
import report.Report;
import file.CSVReader;
This is how Java locates classes in different packages.

Step 4: Remove Compiled Files
Delete all generated .class files.

Keep only source code:

Main.java
Patient.java
PatientService.java
Validator.java
Report.java
CSVReader.java
Your IDE or Maven will regenerate .class files automatically.

Step 5: Improve the Folder Structure
At the project root, organize it like this:

MiniHealthcare/
│
├── src/
├── data/
│     patients.csv
│
├── docs/
│     screenshots/
│
├── reports/
│
├── README.md
├── LICENSE
├── .gitignore
Later, patients.csv will become patients.json.

Step 6: Clean Up Main.java
Main.java should only control the application flow.

It should:

show the menu

read the user's choice

call methods in PatientService

Avoid putting validation or business logic directly in Main.java.

Step 7: Learn These Java Concepts
By completing this milestone, you'll understand:

Packages

Imports

Encapsulation

Separation of Concerns

Project Structure

Single Responsibility Principle (SRP)

Code Organization

These are common interview topics.

📁 Milestone 1 Target Structure
MiniHealthcare
│
├── src
│   ├── app
│   │     Main.java
│   │
│   ├── model
│   │     Patient.java
│   │
│   ├── service
│   │     PatientService.java
│   │
│   ├── validation
│   │     Validator.java
│   │
│   ├── report
│   │     Report.java
│   │
│   ├── file
│   │     CSVReader.java
│   │
│   └── util
│         InputHelper.java
│
├── data
│     patients.csv
│
├── reports
│
├── docs
│
├── README.md
├── LICENSE
└── .gitignore
🎯 Homework (Milestone 1)
Complete these tasks:

Move all Java files into the correct packages.

Add the appropriate package declaration to each file.

Fix all import statements until the project compiles successfully.

Delete all .class files from the repository.

Create the data, reports, and docs folders.

Run the application and verify that every menu option still works exactly as before.

Phase 2 – Replace CSV with JSON (Persistence Layer)
Goal
Instead of storing patient records in patients.csv, your application will store them in a JSON file.

Every time a patient is:

✅ Registered

✅ Updated

✅ Deleted

the JSON file should be updated automatically.

📂 Project Structure
MiniHealthcare/
│
├── src/
│   ├── app/
│   ├── model/
│   ├── service/
│   ├── validation/
│   ├── report/
│   ├── file/
│   │      JsonService.java
│   │      CSVReader.java   (keep temporarily)
│   └── util/
│
├── data/
│      patients.json
│
├── reports/
├── docs/
└── README.md
🎯 Learning Objectives
By the end of this phase, you'll learn:

What JSON is

Serialization

Deserialization

Jackson Library

ObjectMapper

File Handling

Exception Handling

Persistent Storage

These are fundamental skills for Spring Boot development.

🗓️ Phase 2 Roadmap
Module 2.1 – Learn JSON
Understand JSON objects and arrays.

Example:

[
  {
    "patientId": 1001,
    "patientName": "Rahul Sharma",
    "age": 30,
    "gender": "Male",
    "phoneNumber": "9876543210",
    "admissionDate": "27-07-2026"
  }
]

🗓️ Phase 2 Roadmap
Module 2.1 – Learn JSON
Understand JSON objects and arrays.

Example:

[
  {
    "patientId": 1001,
    "patientName": "Rahul Sharma",
    "age": 30,
    "gender": "Male",
    "phoneNumber": "9876543210",
    "admissionDate": "27-07-2026"
  }
]

Module 2.2 – Convert to Maven
Your project should become a Maven project.

MiniHealthcare
│
├── src
├── pom.xml
Add Jackson Dependency
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.18.2</version>
</dependency>
You'll use this library to read and write JSON.

Module 2.3 – Create JsonService
Create:

file/
    JsonService.java
Responsibilities:

Save all patients

Read all patients

Create file if it doesn't exist

Methods to implement:

savePatients()

loadPatients()

createFileIfNotExists()


Module 2.4 – Create patients.json
Inside:

data/
Create:

patients.json
Initially:

[]
An empty array represents no patient records.

Module 2.5 – Save Automatically
Modify PatientService.

After:

registerPatient();
call:

jsonService.savePatients(patientList);
Now every registration is saved permanently.

Module 2.6 – Load Automatically
When the application starts:

Main.java
Instead of:

new ArrayList<>();
load from JSON:

patientList = jsonService.loadPatients();
Now data remains even after restarting the application.


Module 2.7 – Update JSON
Whenever:

Update Patient
finishes successfully:

savePatients();
Module 2.8 – Delete JSON
After deleting:

savePatients();
The deleted patient disappears from the JSON file too.

Module 2.9 – Import Existing CSV Once
Reuse your current CSVReader.

Flow:

patients.csv
        │
        ▼
CSVReader
        │
        ▼
ArrayList<Patient>
        │
        ▼
JsonService
        │
        ▼
patients.json
Once complete, CSV becomes a one-time migration tool.

Module 2.10 – Test Everything
Verify:

Register a patient → appears in JSON

Restart application → data is still available

Update a patient → JSON reflects the change

Delete a patient → removed from JSON

Import CSV → JSON is populated correctly

📚 Concepts You'll Master
By the end of Phase 2, you'll have practical experience with:

JSON

Jackson ObjectMapper

File I/O

Serialization

Deserialization

Maven dependencies

Persistent data storage

