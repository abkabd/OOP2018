import java.util.Scanner;

public class MaxTwo {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println(Math.max(x, y));
    }
}
