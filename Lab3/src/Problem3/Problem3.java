package Problem3;

public class Problem3 {
    static void checkPersonClass() {
        System.out.println("Check Person Class" + "\n" + "*****************\n");

        Person roma = new Person("Roma", 18);
        Person empty = new Person();

        System.out.println(roma.toString());
        System.out.println(empty.toString());
        System.out.println("Roma equals Empty is " + roma.equals(empty));
        System.out.println("Roma equals Roma is " + roma.equals(roma));
        System.out.println();

    }

    static void checkEmployeeClass() {
        System.out.println("Check Employee Class" + "\n" + "*****************\n");

        Employee roma = new Employee("Roma", 18, 12015.65, 3, "17BD116721");
        Employee empty = new Employee();

        System.out.println(roma.toString());
        System.out.println(empty.toString());
        System.out.println("Roma equals Empty is " + roma.equals(empty));
        System.out.println("Roma equals Roma is " + roma.equals(roma));
        System.out.println();
    }

    static void checkManagerClass() {
        System.out.println("Check Manager Class" + "\n" + "*****************\n");

        Manager roma = new Manager("Roma", 18, 12015, 3, "17BD116721", 1400);
        Manager empty = new Manager();

        roma.addEmployee(new Employee("Sagi", 20, 1000, 1, "15BD890223"));
        roma.addEmployee(new Employee("Ryan", 22, 15120, 6, "16DG114289"));
        roma.addEmployee(new Employee("Samantha", 16, 300, 3, "18BD202034"));

        System.out.println(roma.toString());
        System.out.println(empty.toString());
        System.out.println("Roma equals Empty is " + roma.equals(empty));
        System.out.println("Roma equals Roma is " + roma.equals(roma));
        System.out.println();
    }

    public static void main(String args[]) {
        checkPersonClass();
        checkEmployeeClass();
        checkManagerClass();
    }
}
