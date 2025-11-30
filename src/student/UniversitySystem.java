package student;

import java.util.ArrayList;
import java.util.Collections;

public class UniversitySystem {
    private ArrayList<Student>students = new ArrayList<>();
    private ArrayList<Course>courses = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void printAllStudent() {
        System.out.println("----- All Students -----");
        for (Student s : students) {
            s.printlnfo();
        }
    }

    public void printAllCourses() {
        System.out.println("----- All Courses -----");
        for (Course c : courses) {
            c.printlnfo();
        }
    }

    public void sortStudentsByGpa() {
        Collections.sort(students);
    }

    public Student cloneStudent(String id) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                return s.clone();
            }
        }
        return null;
    }
}
