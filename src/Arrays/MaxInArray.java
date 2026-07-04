package Arrays;

public class MaxInArray {
    static void main() {
        int arr[]= {3,2,-5,21,10};
        int max=arr[0];
        int n =arr.length;
        for (int i=0 ; i<=n-1; i++){
            if(arr[i]>max) {
              max=arr[i];
            }

        }
        System.out.println(max);

    }

}
