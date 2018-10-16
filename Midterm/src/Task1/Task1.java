package Task1;

public class Task1 {
    public static void main(String [] args) {
        Sequence s = new Sequence("abaccaba");
        Sequence t = new Sequence("acc");

        System.out.println("s is a palindrome: " + s.isPalindrome());
        System.out.println("t is a palindrome: " + t.isPalindrome());
        System.out.println();
        System.out.println("t is a substring of s: " + s.isSubString(t));
        System.out.println("s is a substring of t: " + t.isSubString(s));
    }
}
