package While;

import java.util.Scanner;

public class Pow2List {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int i = 1, n = input.nextInt();
        while(i <= n){
            System.out.println(i);
            i *= 2;
        }
    }
}
