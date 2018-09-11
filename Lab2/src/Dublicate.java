public class Dublicate {
    public static int[] db(int[] arr){
        int[] res = new int[2*arr.length];
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            res[i*2] = arr[i];
            res[i*2+1] = arr[i];
        }
        return res;
    }
    public static void main(String []args){
        int[] a = {1, 2, 3};
        int[] b = new int[2*a.length];
        b = db(a);
        System.out.println();
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
