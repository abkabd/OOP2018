package Problem1;

public class Problem1b {
    public static void main(String [] args)
    {
        Files files = new Files();
        files.read("scores.txt");
        files.writeStats("grades.txt");
    }
}
