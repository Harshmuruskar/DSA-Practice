package Arrays;

public class MultiplicationInArray {
    static void main() {
        int arr[] = {10,20,30,40,50};
        int sum=0;
        int n = arr.length;
        for(int i=0; i<=n-1 ; i++){
            sum= sum + arr[i];
        }
        System.out.println(sum);
    }
}
