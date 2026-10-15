package Arrays;

public class BreakSortedArray {

    static int breakSortedArray(int [] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,0,5};
        System.out.println(breakSortedArray(arr));


    }
}
