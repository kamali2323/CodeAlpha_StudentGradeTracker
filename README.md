# Student Grade Tracker

## Description

Student Grade Tracker is a Java console application that helps users store and manage student grades. The program allows users to enter student details, add grades, and display a report for all students.

## Features

* Add multiple students
* Store student ID and name
* Add multiple grades for each student
* Display student details and grades
* Simple and user-friendly console interface

## Technologies Used

* Java
* ArrayList
* Object-Oriented Programming (OOP)
* Scanner Class

## Project Structure

```text
StudentGradeTracker/
│
├── StudentGradeTracker.java
├── Student.java
└── README.md
```

## How to Run

### Compile

```bash
javac Student.java StudentGradeTracker.java
```

### Execute

```bash
java StudentGradeTracker
```

## Sample Output

```text
===== Student Grade Tracker =====

Enter number of students: 1

Enter details for Student 1
Student ID: 101
Student Name: John
Enter number of grades: 3
Enter grade 1: 85
Enter grade 2: 90
Enter grade 3: 88

===== Student Report =====
Student ID: 101
Name: John
Grades: [85, 90, 88]
```
