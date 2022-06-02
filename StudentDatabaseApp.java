package JavaStudentDatabase;
import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

// package studentdatabaseapp;

public class StudentDatabaseApp {
    
    public static void main(String[] args) {
       

        System.out.println("Enter the number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int i=0; i<numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i=0; i<numOfStudents; i++) {
            System.out.println(students[i].toString());
        }
    }

}
