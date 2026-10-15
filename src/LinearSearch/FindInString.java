package LinearSearch;

public class FindInString {

    public static void main(String[] args) {

        String str = "Harsh";
        char target = 's';
        System.out.println(linerSearch(str, target));
    }

    static boolean linerSearch(String str, char target){
        if (str.length() == 0) {

            return false;
        }

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)== target){
                return true;
            }
        }
        return false;
    }
}
