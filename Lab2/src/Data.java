import java.util.Scanner;

public class Data {
    private double sum;
    private double max;
    private int count;

    Data(){
        sum = 0;
        count = 0;
    }

    void Add(int newData)
    {
        if(count == 0)
            max = newData;

        max = Math.max(max, newData);
        sum += newData;
        count++;
    }

    double Average(){
        if(count == 0)
            return 0;
        return sum/count;
    }

    double getMax(){
        return max;
    }
}

class Analyzer{
    public static void main(String [] args){
            Data data = new Data();
            Scanner sc = new Scanner(System.in);
            String s = new String();

            while(true){
                System.out.println("Enter number (Q to quit): ");
                s = sc.next();
                if(s.equals("Q"))
                {
                    break;
                }

                data.Add(Integer.parseInt(s));
            }

            System.out.println("Average: " + data.Average());
            System.out.println("Maximum: " + data.getMax());

        }
}
