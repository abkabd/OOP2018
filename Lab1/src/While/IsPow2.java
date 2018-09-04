package While;

import java.util.Scanner;

public class IsPow2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n%2==0){
            n /= 2;
        }
        if(n == 1)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
