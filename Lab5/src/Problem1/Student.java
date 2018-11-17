package Problem1;

public class Student {
    public static int bestScore = 0;
    public static int worstScore = 100;
    public static int sumOfScores = 0;
    private String name;
    private String sname;
    private int score;
    public Student(String sname, String name, int score)
    {
        this.name = name;
        this.sname = sname;
        this.score = score;
    }

    public String grade()
    {
        if(score >= bestScore - 10){
            return "A";
        }
        if(score >= bestScore - 20){
            return "B";
        }
        if(score >= bestScore - 30){
            return "C";
        }
        if(score >= bestScore - 40){
            return "D";
        }
        return "F";
    }

    @Override
    public String toString() {
        return sname + " " + name;
    }
}
