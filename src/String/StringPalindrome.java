package String;

public class StringPalindrome {

    public String palindrome(String name){
        String rev="";
        int n = name.length();
        for(int i=n-1; i>=0 ; i--){
            char ch = name.charAt(i);
            rev= rev+ ch;
            if(name.equals(rev)){
                return "Palindrome";
            }
        }
        return "Not a Palindrome";
    }


    static void main() {
        String name = "harsh";
        StringPalindrome sp = new StringPalindrome();
        System.out.println(sp.palindrome(name));
    }
}
