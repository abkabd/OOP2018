package Array;

import java.util.Scanner;

public class A {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[200];
        int n = input.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        for(int i=0; i<n; i+=2){
            System.out.println(arr[i]);
        }


    }
}
