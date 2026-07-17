import java.util.Stack;

public class DeletedStack {

    // Stack Data Structure
    Stack<Student> deletedStudents = new Stack<>();


    // Add deleted student to Stack
    public void addDeletedStudent(Student student) {

        deletedStudents.push(student);

        System.out.println("Student added to deleted history.");

    }


    // View Deleted Students
    public void viewDeletedStudents() {

        if (deletedStudents.isEmpty()) {

            System.out.println("No deleted students.");

        } else {

            System.out.println("\n========== DELETED STUDENTS ==========");

            for (Student student : deletedStudents) {

                student.displayStudent();

            }

        }

    }

}