package Arrays;

public class MinInArray {
    static void main() {
        int arr[] ={ 3,2,-5,21,10};
        int min = arr[0];
        int n = arr.length;
        for(int i=0 ; i<=n-1; i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println(min);
    }
}
