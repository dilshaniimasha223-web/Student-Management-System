import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    // ArrayList Data Structure
    ArrayList<Student> students = new ArrayList<>();

    // Stack Data Structure
    DeletedStack stack = new DeletedStack();

    Scanner input = new Scanner(System.in);


    // Add Student
    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student added successfully!");

    }


    // View All Students
    public void viewStudents() {

        if (students.isEmpty()) {

            System.out.println("No students available.");

        } else {

            System.out.println("\n========== STUDENT LIST ==========");

            for (Student student : students) {

                student.displayStudent();

            }

        }

    }


    // Search Student using Linear Search Algorithm
    public void searchStudent(int id) {

        boolean found = false;

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.println("\nStudent Found!");

                student.displayStudent();

                found = true;

                break;

            }

        }


        if (!found) {

            System.out.println("Student not found!");

        }

    }


    // Update Student
    public void updateStudent(int id) {

        boolean found = false;

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.print("Enter New Name: ");
                String name = input.nextLine();

                System.out.print("Enter New Course: ");
                String course = input.nextLine();

                System.out.print("Enter New Academic Year: ");
                int year = input.nextInt();
                input.nextLine();

                student.updateDetails(name, course, year);

                System.out.println("Student updated successfully!");

                found = true;

                break;

            }

        }


        if (!found) {

            System.out.println("Student not found!");

        }

    }


    // Delete Student
    public void deleteStudent(int id) {

        boolean removed = false;

        for (Student student : students) {

            if (student.getId() == id) {

                students.remove(student);

                // Store deleted student in Stack
                stack.addDeletedStudent(student);

                System.out.println("Student deleted successfully!");

                removed = true;

                break;

            }

        }


        if (!removed) {

            System.out.println("Student not found!");

        }

    }


    // View Deleted Students
    public void viewDeletedStudents() {

        stack.viewDeletedStudents();

    }

}