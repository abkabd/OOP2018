package Problem1;

import java.io.*;
import java.util.Vector;

public class Files {
    Vector<Student> students;

    public Files()
    {
        students = new Vector<Student>();
    }

    public void read(String path)
    {
        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line;
            while((line = br.readLine()) != null){
                addStudent(line);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void writeGrades(String path)
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, false)))
        {
            int i=1;
            for(Student st: students)
            {
                bw.write(String.format("%d) %s - \"%s\"\n", i++, st.toString(), st.grade()));
            }
            bw.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public void addStudent(String str)
    {
        String[] parts = str.split(" ");
        int score = Integer.parseInt(parts[2]);
        students.add(new Student(parts[0], parts[1], score));
        Student.bestScore = Math.max(Student.bestScore, score);
        Student.worstScore = Math.min(Student.worstScore, score);
        Student.sumOfScores +=  score;
    }

    public void writeStats(String path) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
        {
            bw.write(String.format("Average - %f\n", Student.sumOfScores/students.size()*1.0));
            bw.write(String.format("Maximum - %d\n", Student.bestScore));
            bw.write(String.format("Minimum - %d\n", Student.worstScore));
            bw.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
