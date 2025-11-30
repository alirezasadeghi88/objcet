package student;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, int age, Address address
    , String id, double gpa) {
        super(name, age, address, id, gpa);
    }

    @Override
    public void printlnfo() {
        System.out.println("Undergraduate → ");
        super.printlnfo();
    }
}
