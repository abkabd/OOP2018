package For;

import java.util.Scanner;

public class SumN {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, x, n;
        n = input.nextInt();
        for(int i=0; i<n; i++){
            x = input.nextInt();
            sum += x;
        }
        System.out.println(sum);
    }
}
