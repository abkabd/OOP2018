package Problem3;

public class Employee extends Person {
    private double salary;
    private int year;
    private String insuranceNumber;

    public Employee() {
        super();
        this.salary = 0;
        this.year = 0;
        this.insuranceNumber = "unknown";
    }

    public Employee(String name, int age, double salary, int year, String insuranceNumber) {
        super(name, age);
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    public boolean equals(Employee e) {
        return (super.equals(e) &&
                this.salary == e.salary && this.year == e.year &&
                this.insuranceNumber.equals(e.insuranceNumber));
    }

    public String toString() {
        return super.toString() + String.format("Salary: %f\nYear: %d\nInsurance number: %s\n", salary, year, insuranceNumber);
    }
}
