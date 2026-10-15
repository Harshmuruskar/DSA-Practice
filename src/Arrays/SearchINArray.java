package Arrays;

public class SearchINArray {

    static int searchInArray(int arr[], int target){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        System.out.println(searchInArray(arr1,5));
    }


}
