import java.util.Scanner;

public class H {
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = inp.nextInt();
        }

        int middle = 0;

        for(int i=0; i<n-1; i += 2){
            middle = a[i];
            a[i] = a[i+1];
            a[i+1] = middle;
        }


        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
