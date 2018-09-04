import java.util.Scanner;

public class LeapYear {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if((x%4==0 && x%100!=0) || (x%400==0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
