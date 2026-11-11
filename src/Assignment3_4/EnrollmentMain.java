
package Assignment3_4;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;

public class EnrollmentMain {

    public static void main(String[] args) {

        Student student = new Student(1, "Alex", 22);

        Course course = new Course(
                "JAVA101", "Java Programming", "John Smith");

        Enrollment enrollment = new Enrollment(
                student, course, "11.11.2026");

        try {
            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream("enrollments.ser"));

            output.writeObject(enrollment);
            output.close();

            System.out.println("Enrollment saved successfully.");

            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("enrollments.ser"));

            Enrollment loadedEnrollment =
                    (Enrollment) input.readObject();

            input.close();

            System.out.println("\nEnrollment loaded from file:");
            System.out.println("Student ID: " +
                    loadedEnrollment.getStudent().getId());
            System.out.println("Student Name: " +
                    loadedEnrollment.getStudent().getName());
            System.out.println("Student Age: " +
                    loadedEnrollment.getStudent().getAge());
            System.out.println("Course Code: " +
                    loadedEnrollment.getCourse().getCourseCode());
            System.out.println("Course Name: " +
                    loadedEnrollment.getCourse().getCourseName());
            System.out.println("Instructor: " +
                    loadedEnrollment.getCourse().getInstructor());
            System.out.println("Enrollment Date: " +
                    loadedEnrollment.getEnrollmentDate());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

