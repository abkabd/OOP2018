package Problem1;

public class Problem1 {
    public static void main(String [] args)
    {
        Files files = new Files();
        files.read("scores.txt");
        files.writeGrades("grades.txt");
    }
}
