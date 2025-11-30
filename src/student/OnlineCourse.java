package student;

public class OnlineCourse extends Course{
    private String platform;

    public OnlineCourse(String name, int capacity, String platform) {
        super(name, capacity);
        this.platform = platform;
    }

    @Override
    public void printlnfo() {
        System.out.println("Online Course on " + platform);
        super.printlnfo();
    }
}
