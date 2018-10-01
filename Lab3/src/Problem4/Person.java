package Problem4;

public class Person {
    String name;

    public Person() {
        this.name = "unknown";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Person Name: " + this.name);
        return this.name;
    }
}
