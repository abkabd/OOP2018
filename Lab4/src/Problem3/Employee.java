package Problem3;

import java.util.Date;

public class Employee extends Person implements Comparable, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee() {
        super();
        this.salary = 0;
        this.hireDate = new Date();
        this.insuranceNumber = "unknown";
    }

    public Employee(String name, int age, double salary, Date hireDate, String insuranceNumber) {
        super(name, age);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee) {
            Employee e = (Employee) obj;
            return (super.equals(e) &&
                    this.salary == e.salary && this.hireDate == e.hireDate &&
                    this.insuranceNumber.equals(e.insuranceNumber));
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Salary: %f\nhireDate: %s\nInsurance number: %s\n", salary, hireDate.toString(), insuranceNumber);
    }

    @Override
    public int compareTo(Object obj) {
        Employee other = (Employee) obj;
        if (salary < other.salary) return -1;
        if (salary > other.salary) return 1;
        return 0;
    }

    @Override
    public Employee clone(){
        try {
            Employee e = (Employee) super.clone();
            e.salary = salary;
            e.hireDate = hireDate;
            e.insuranceNumber = insuranceNumber;
            return e;
        }
        catch (CloneNotSupportedException ex){
            throw new InternalError();
        }
    }
}
