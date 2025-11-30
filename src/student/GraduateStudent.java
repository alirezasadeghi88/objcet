package student;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, Address
                           address, String id, double gpa) {
        super(name, age, address, id, gpa);
    }

    @Override
    public void printlnfo() {
        System.out.print("Graduate → ");
        super.printlnfo();
    }
}
