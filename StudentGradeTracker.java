
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("===== Student Grade Tracker =====");

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.println("\nEnter details for Student " + i);

            System.out.print("Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Student Name: ");
            String name = scanner.nextLine();

            Student student = new Student(id, name);

            System.out.print("Enter number of grades: ");
            int gradeCount = scanner.nextInt();

            for (int j = 1; j <= gradeCount; j++) {
                System.out.print("Enter grade " + j + ": ");
                int grade = scanner.nextInt();
                student.addGrade(grade);
            }

            students.add(student);
        }

        System.out.println("\n===== Student Report =====");

        for (Student student : students) {
            student.displayStudentDetails();
        }

        scanner.close();
    }
}