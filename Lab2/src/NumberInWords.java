import java.util.Scanner;

public class NumberInWords {

    public static String[] snum =
                                {
                                "", "one", "two", "three", "four",
                                "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                                "eighteen", "nineteen"
                                };
    public static String[] lnum =
            {
            "","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
            };
    public static String inWords(int n)
    {
        if(n<20)
        {
            return snum[n];
        }
        else if(n<100)
        {
            return lnum[n/10]+ " " + snum[n % 10];
        }
        else if(n<1000)
        {
            return snum[n/100]+" hundred "+" " + inWords(n % 100);
        }
        else if(n<100000)
        {
            return inWords(n/1000)+" thousands"+" "+inWords(n%1000);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int num=sc.nextInt();
            if(num == 0)
            {
                System.out.println("zero");
            }
            else
                System.out.println(inWords(num));
        }

    }

}