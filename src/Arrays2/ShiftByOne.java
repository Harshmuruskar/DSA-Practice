package Arrays2;

public class ShiftByOne {

    static void  shiftByOne(int []arr){
        int n = arr.length;
        int temp=arr[n-1];
        for(int i=n-1; i>0 ; i++){
            arr[i-1]=arr[i];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        System.out.println(arr);

    }
}
