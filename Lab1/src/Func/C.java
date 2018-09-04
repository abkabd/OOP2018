//package Func;

import java.util.Scanner;

public class C {
    static int Xor(int x, int y)
    {
        return x^y;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(Xor(a, b));
    }
}
