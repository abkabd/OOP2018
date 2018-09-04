import java.util.Scanner;

public class TestingSystem {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String ans = "";
        if(a == 1){
            if(b == 1)
                ans = "YES";
            else
                ans = "NO";

        }
        else{
            if(b == 1)
                ans = "NO";
            else
                ans = "YES";
        }

        System.out.println(ans);

    }
}
