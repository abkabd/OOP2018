import java.util.Scanner;

public class MKAD {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int v = input.nextInt();
        int t = input.nextInt();
        int d = Math.abs(v*t)%109, ans;

        if(v>=0)
        {
            ans = d%109;
        }
        else
        {
            ans = (109-d)%109;
        }

        System.out.println(ans);
    }
}
