package Problem3;

import java.util.Objects;

public class Person implements Cloneable{
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
    public Person clone(){
        try{
            Person p = (Person)super.clone();
            p.name = name;
            return p;
        }catch (CloneNotSupportedException ex){
            System.out.println("Error");
            throw new InternalError();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Person) {
            Person p = (Person) obj;
            return (this.age == p.age && this.name.equals(p.name));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17*31*age+name.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %d\n", name, age);
    }
}
