public class Student {

    private int id;
    private String name;
    private String course;
    private int year;

    // Constructor
    public Student(int id, String name, String course, int year) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    // Update Student Details
    public void updateDetails(String name, String course, int year) {
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Display Student Details
    public void displayStudent() {
        System.out.println("----------------------------");
        System.out.println("Student ID      : " + id);
        System.out.println("Name            : " + name);
        System.out.println("Course          : " + course);
        System.out.println("Academic Year   : " + year);
        System.out.println("----------------------------");
    }
}