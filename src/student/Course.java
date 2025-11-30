package student;

import java.util.ArrayList;

public abstract class Course implements Printable{
    protected String name;
    protected int capacity;
    protected ArrayList<Student>students = new ArrayList<>();

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void addStudent(Student s) {
        if (students.size() < capacity) {
            students.add(s);
        }else {
            System.out.println("Course is full!");
        }
    }

    public void removeStudent(String id) {
        students.removeIf(s -> s.getStudentId().equals(id));
    }

    @Override
    public void printlnfo() {
        System.out.println("Course: " + name + " | Capacity: " +
                capacity);
        System.out.println("Students enrolled:");
        for (Student s : students) {
            s.printlnfo();
        }
    }
}
