import java.util.Scanner;

public class NumSign {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), ans=0;

        if(x>0)
            ans = 1;
        if(x<0)
            ans = -1;

        System.out.println(ans);
    }
}
