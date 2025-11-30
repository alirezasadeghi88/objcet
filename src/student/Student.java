package student;

public class Student extends Person implements Comparable<Student>,
Cloneable{

    private String studentId;
    private double gpa;

    public Student(String name, int age, Address address, String studentId,
                   double gpa) {
        super(name, age, address);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void printlnfo() {
        System.out.println("Student :" + name + "ID :" + studentId +
                "GPA :" + gpa + "Address :" + address);
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public Student clone() {
        return new Student(this.name, this.age, new Address(this.address),
                this.studentId, this.gpa);
    }
}
