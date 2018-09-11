public class Student {

    String name;
    String id;
    int year;

    Student(String name, String id){
        this.name = name;
        this.id = id;
        this.year = 2018;
    }

    String getName()
    {
        return this.name;
    }

    String getID()
    {
        return this.id;
    }

    void addYear()
    {
        this.year++;
    }

    void showInfo()
    {
        System.out.printf("%s %s %d\n", getName(), getID(), year);
    }

    public static void main(String[] args)
    {
        Student st = new Student("Aybek", "17BD512477");
        st.showInfo();
        st.addYear();
        st.showInfo();
    }
}

