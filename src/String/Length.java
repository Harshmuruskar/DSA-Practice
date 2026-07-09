package String;

public class Length {

    static int getStringLength(String name){
        int count=0;
        char arr[]= name.toCharArray();
        int len = arr.length;
        return len;


    }
    static void main() {
        String name = "Harsh";
        System.out.println(getStringLength(name));

    }
}
