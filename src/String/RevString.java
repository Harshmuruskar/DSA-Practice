package String;

public class RevString {
    static String revString(String name){
        String rev = "";
        int n= name.length();
        for(int i=n-1; i>=0;i--){
            char ch = name.charAt(i);
            rev=rev+ch;
        }
        return rev;
    }
    static void main() {

        String name= "Harsh";
        System.out.println(revString(name));

    }
}
