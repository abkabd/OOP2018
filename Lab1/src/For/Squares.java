package For;

import java.util.Scanner;

public class Squares {
    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for(int  i = 1; i*i <= b; i++){
            if(i*i >= a)
                System.out.print(i*i + " ");
        }
    }
}
