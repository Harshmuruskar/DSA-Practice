package Arrays;

public class MultiplyArray {
    static void main() {
        int arr []= {2,3,10,20};
        int n =arr.length;
        int mul=1;
        for(int i=0 ; i<=n-1; i++){
            mul = mul*arr[i];
        }
        System.out.println(mul);

    }
}
