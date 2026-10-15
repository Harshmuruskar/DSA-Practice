package Arrays;

public class CountZerosAndOnes {
    static int [] countZerosAndOnes(int [] arr) {
        int zerocount =0;
        int onecount=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                zerocount++;
            }else{
                onecount++;
            }
        }
        int [] ans= {zerocount,onecount};
        return ans;
    }
    public static void main(String[] args) {

        int [] arr= {0,1,0,1,1,0,0,1};
        int [] result= countZerosAndOnes(arr);
        System.out.println("Zeros: "+result[0]+", Ones: "+result[1]);

    }
}
