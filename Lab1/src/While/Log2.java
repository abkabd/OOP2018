//package While;

import java.util.Scanner;

public class Log2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x = 1, i = 0;
        while(x < n){
            x *= 2;
            i++;
        }
        System.out.println(i);

    }
}
