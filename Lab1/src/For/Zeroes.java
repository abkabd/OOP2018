package For;

import java.util.Scanner;

public class Zeroes {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0, x, n;
        n = input.nextInt();
        for(int i=0; i<n; i++){
            x = input.nextInt();
            if(x == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
