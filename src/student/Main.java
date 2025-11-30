package student;

public class Main {
    public static void main(String[] args) {

        UniversitySystem uni = new UniversitySystem();

        Student s1 = new UndergraduateStudent("Ali", 20,
                new Address("Tehran", "Valiasr"), "401",17.8);
        Student s2 = new GraduateStudent("Sara", 25,
                new Address("Shiraz", "Zand"), "402", 18.6);


        uni.addStudent(s1);
        uni.addStudent(s2);


        Course c1= new OnlineCourse("Java Programming", 30,
                "Moodle");
        Course c2= new OnCampusCourse("Algorithms", 40, "Room 22");

        c1.addStudent(s1);
        c2.addStudent(s2);

        uni.addCourse(c1);
        uni.addCourse(c2);

        uni.printAllStudent();
        uni.printAllCourses();

        System.out.println("\n--- Sorting Students by GPA ---");
        uni.sortStudentsByGpa();
        uni.printAllStudent();

        System.out.println("\n--- Cloning Student Sara ---");
        Student clone = uni.cloneStudent("402");
        clone.printlnfo();
    }
}
