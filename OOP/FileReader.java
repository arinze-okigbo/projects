import java.io.*;
import java.util.*;

public class FileReader {
    public static ArrayList<Student> loadStudents(String fileName) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            students.add(new Student(data[0], data[1], data[2], data[3], data[4], data[5]));
        }
        br.close();
        return students;
    }

    public static ArrayList<Teacher> loadTeachers(String fileName) throws IOException {
        ArrayList<Teacher> teachers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            teachers.add(new Teacher(data[0], data[1], data[2], data[3], data[4]));
        }
        br.close();
        return teachers;
    }

    public static ArrayList<Course> loadCourses(String fileName) throws IOException {
        ArrayList<Course> courses = new ArrayList<>();
        BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            courses.add(new Course(data[0], data[1], data[2]));
        }
        br.close();
        return courses;
    }

    public static ArrayList<Department> loadDepartments(String fileName) throws IOException {
        ArrayList<Department> departments = new ArrayList<>();
        BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            departments.add(new Department(data[0], data[1], data[2]));
        }
        br.close();
        return departments;
    }
}
