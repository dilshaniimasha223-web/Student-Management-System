import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentManager manager = new StudentManager();
        RegistrationQueue queue = new RegistrationQueue();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" Student Management System ");
            System.out.println("==============================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Add Registration Request");
            System.out.println("7. Complete Registration");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();


            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = input.nextInt();

                    input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Course: ");
                    String course = input.nextLine();

                    System.out.print("Enter Academic Year: ");
                    int year = input.nextInt();


                    Student student = new Student(
                            id,
                            name,
                            course,
                            year
                    );

                    manager.addStudent(student);

                    break;


                case 2:

                    manager.viewStudents();

                    break;


                case 3:

                    System.out.print("Enter Student ID to search: ");
                    int searchID = input.nextInt();

                    manager.searchStudent(searchID);

                    break;


                case 4:

                    System.out.print("Enter Student ID to update: ");
                    int updateID = input.nextInt();

                    input.nextLine();

                    manager.updateStudent(updateID);

                    break;


                case 5:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteID = input.nextInt();

                    manager.deleteStudent(deleteID);

                    break;


                case 6:

                    input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String studentName = input.nextLine();

                    queue.addRequest(studentName);

                    break;


                case 7:

                    queue.processRequest();

                    break;


                case 8:

                    System.out.println("Thank You!");

                    break;


                default:

                    System.out.println("Invalid choice!");

            }

        } while (choice != 8);


        input.close();

    }

}