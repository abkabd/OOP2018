package Array;

import java.util.Scanner;

public class D {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20000];
        int n = input.nextInt();
        int cnt = 0;

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1])
                cnt++;
        }
        System.out.println(cnt);
    }
}
