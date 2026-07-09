package String;

public class Vovels {
    static int getvovels(String name){
        int count=0;
        for(int i= 0 ; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }

        }
        return count;
    }
    static void main() {
        String name = "Harsh";
        System.out.println(getvovels(name));

    }
}
