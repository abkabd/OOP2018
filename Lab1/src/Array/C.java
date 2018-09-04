package Array;

import java.util.Scanner;

public class C {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[200];
        int n = input.nextInt();
        int cnt = 0;

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i] > 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
