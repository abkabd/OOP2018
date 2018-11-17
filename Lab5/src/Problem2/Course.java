package Problem2;

import java.io.*;
import java.util.Vector;

public class Course implements Serializable{
    private String courseTitle;
    private Textbook textbook;
    private Instructor instructor;

    public Course(String courseTitle, Textbook textbook, Instructor instructor) {
        this.courseTitle = courseTitle;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return String.format("Course: %s Teacher: %s Book: %s", courseTitle, instructor.toString(), textbook.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Course) {
            Course c = (Course) obj;
            return (this.courseTitle.equals(c.courseTitle) &&
                    this.instructor.equals(c.instructor) &&
                    this.textbook.equals(c.textbook));
        }
        return false;
    }

    public static void save(Vector<Course> courses) throws IOException {
        ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("Courses.out", false));
        oos.writeObject(courses);
        oos.close();
    }

    public static Vector<Course> get() throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Courses.out"));
        Vector<Course> courses = (Vector<Course>) ois.readObject();
        ois.close();
        return courses;
    }
}
