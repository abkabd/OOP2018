import java.util.Scanner;

public class Hypotenuse {
    public static void main(String args[])
    {
        int a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println(Math.sqrt(a*a+b*b));
    }
}
