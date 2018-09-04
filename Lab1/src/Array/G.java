package Array;

import java.util.Scanner;

public class G {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[50];
        int n = input.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }

    }
}
