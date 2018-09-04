package For;

import java.util.Scanner;

public class MinDivisor {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for(int i=2; i<=x; i++){
            if(x%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
