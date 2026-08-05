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

