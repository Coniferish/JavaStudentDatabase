package JavaStudentDatabase;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private byte yearsEnrolled;
    private String courses = "";
    private int tuitionBalance;
    private String studentId;
    private static short id = 1000;
    private static short COSTOFCOURSE = 600;

    // Contructor to ask for student's name a year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        String s = new StringBuilder()
        .append("1 - Freshman")
        .append("\n2 - Sophmore")
        .append("\n3 - Junior")
        .append("\n4 - Senior")
        .append("\nEnter the student's year:")
        .toString();

        System.out.println(s);
        this.yearsEnrolled = in.nextByte();

        setStudentId();

    }

    // Generate a student id
    private void setStudentId() {
        id++;
        this.studentId = yearsEnrolled + "" + id;
    }

    // Enroll student in courses
    public void enroll() {
        while (true) {
            System.out.print("Enter course to enroll in (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (course.toLowerCase().equals("q")) {
                break;
            } else { 
                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + COSTOFCOURSE; 
            }
        }

        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition Balance: $" + tuitionBalance);
    }

    // View student's balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Please make a payment towards your tuition or enter zero (0).");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment!");
        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
        "\nCourses Enrolled:" + courses + 
        "\nBalance: $" + tuitionBalance;
    }
}
