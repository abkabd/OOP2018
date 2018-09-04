package Func;

import java.util.Scanner;

public class A {
    static int Min (int a, int b, int c, int d){
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println(Min(a, b, c, d));
    }
}
