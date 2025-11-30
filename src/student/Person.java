package student;

public class Person implements Printable {
    protected String name;
    protected int age;
    protected Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address);
    }

    @Override
    public void printlnfo() {
        System.out.println("Name :" + name + "Age :" + age + "Address :" +
                address);
    }

}
