import java.util.Scanner;

public class NextPrev {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.printf("The next number for the number %d is %d.\n", x, x+1);
        System.out.printf("The previous number for the number %d is %d.\n", x, x-1);
    }
}
