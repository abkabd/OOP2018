//package For;

import java.util.Scanner;

public class DivisorsAmount {
    public static boolean IsPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 2, ans = 1, k = 1;
        while(n > 1){

            if(IsPrime(n)){
                if(n == i){
                    k++;}
                else{
                    ans *= k;
                    k = 2;}
                n = 1;
            }

            if(n % i == 0){
                n /= i;
                k++;
            }
            else{
                i++;
                ans *= k;
                k = 1;
            }
        }

        System.out.println(ans*k);
    }
}
