package Week3.Methods.task1.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        Student student = new Student(1, "John", 20);
        Course course = new Course("CS101", "Intro to Programming", "Prof. Smith");
        Enrollment enrollment = new Enrollment(student, course, "2023-09-15");

        // Serialize and save the Enrollment instance
        serializeEnrollment(enrollment, "enrollments.ser");

        // Deserialize and print the Enrollment instance
        Enrollment deserializedEnrollment = deserializeEnrollment("enrollments.ser");
        if (deserializedEnrollment != null) {
            System.out.println("Student: " + deserializedEnrollment.getStudent().getName());
            System.out.println("Course: " + deserializedEnrollment.getCourse().getCourseName());
            System.out.println("Enrollment Date: " + deserializedEnrollment.getEnrollmentDate());
        }
    }

    private static void serializeEnrollment(Enrollment enrollment, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(enrollment);
            System.out.println("Enrollment serialized and saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Enrollment deserializeEnrollment(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Enrollment enrollment = (Enrollment) in.readObject();
            System.out.println("Enrollment deserialized from " + filename);
            return enrollment;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
