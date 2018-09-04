package While;

import java.util.Scanner;

public class MinDiv {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int i = 2, n = input.nextInt();
        while(n%i!=0){
            i++;
        }
        System.out.println(i);
    }
}
