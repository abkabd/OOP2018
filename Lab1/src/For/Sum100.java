//package For;


import java.util.Scanner;

public class Sum100 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, x;
        for(int i=0; i<100; i++){
            x = input.nextInt();
            sum += x;
        }
        System.out.println(sum);
    }
}
