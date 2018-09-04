package Func;

import java.util.Scanner;

public class B {
    static double Pow (double a, int n){
        if(n == 0) return 1;
        double ans = 1;
        while(n-->0){
            ans *= a;
        }
        return ans;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        int b = input.nextInt();

        System.out.println(Pow(a, b));
    }
}
