package student;

public class OnCampusCourse extends Course{
    private String room;

    public OnCampusCourse(String name, int capacity, String room) {
        super(name, capacity);
        this.room = room;
    }

    @Override
    public void printlnfo() {
        System.out.println("On-Campus Course in room " + room);
        super.printlnfo();
    }
}
