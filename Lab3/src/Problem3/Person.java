package Problem3;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Person p) {
        return (this.age == p.age && this.name.equals(p.name));
    }

    public String toString() {
        return String.format("Name: %s\nAge: %d\n", name, age);
    }
}
