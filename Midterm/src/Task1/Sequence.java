package Task1;

public class Sequence {
    private String myString;

    Sequence(String myString) {
        this.myString = myString;
    }

    public boolean isPalindrome() {
        String str = this.myString;
        int n = str.length();
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
    }

    public boolean isSubString(Sequence s) {
        String str = this.myString;
        String str2 = s.myString;
        for(int i = 0; i <= str.length() - str2.length(); i++){
            String tmp = str.substring(i, i + str2.length());
            if(tmp.equals(str2))
            {
                return true;
            }
        }
        return false;
    }
}
