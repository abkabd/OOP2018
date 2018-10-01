package Problem4;

public class Student extends Person{

    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    public String getName() {
        System.out.println("Student Name: " + super.name);
        return super.name;
    }
}
