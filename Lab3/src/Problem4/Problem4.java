package Problem4;

public class Problem4 {

    public static void printInformation(Person p) {
        p.getName();
    }

    public static void main(String args[]) {
        Student st = new Student("Gani");
        Employee emp = new Employee("Kasym");

        Person ref;

        ref = st;
        ref.getName();

        ref = emp;
        ref.getName();

        printInformation(st);
        printInformation(emp);
    }
}
