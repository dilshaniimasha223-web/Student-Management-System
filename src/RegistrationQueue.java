import java.util.LinkedList;
import java.util.Queue;

public class RegistrationQueue {

    // Queue Data Structure
    Queue<String> registrationRequests = new LinkedList<>();


    // Add Registration Request
    public void addRequest(String name) {

        registrationRequests.add(name);

        System.out.println("Registration request added successfully!");

    }


    // View Registration Queue
    public void viewQueue() {

        if (registrationRequests.isEmpty()) {

            System.out.println("No registration requests.");

        } else {

            System.out.println("\n========== REGISTRATION QUEUE ==========");

            int count = 1;

            for (String name : registrationRequests) {

                System.out.println(count + ". " + name);

                count++;

            }

        }

    }


    // Complete Registration using FIFO Queue
    public void processRequest() {

        if (registrationRequests.isEmpty()) {

            System.out.println("No pending registration requests.");

        } else {

            String name = registrationRequests.poll();

            System.out.println("\nProcessing Registration...");
            System.out.println("Student Name : " + name);
            System.out.println("Registration completed successfully!");

        }

    }

}