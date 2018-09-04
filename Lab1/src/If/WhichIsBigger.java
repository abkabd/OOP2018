import java.util.Scanner;

public class WhichIsBigger {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ans=0;

        if(a>b)
            ans = 1;
        if(a<b)
            ans = 2;

        System.out.println(ans);
    }
}
