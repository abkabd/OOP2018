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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person p = (Person) obj;
            return (this.age == p.age && this.name.equals(p.name));
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %d\n", name, age);
    }
}
